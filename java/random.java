import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelLotteryPicker {
    public static void main(String[] args) throws IOException {
        // 1. 엑셀 파일에서 응모자 명단 읽기
        String excelPath = "applicants.xlsx"; // 엑셀 파일 경로
        List<String> applicants = new ArrayList<>();

        FileInputStream fis = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0); // 첫 번째 시트

        for (Row row : sheet) {
            Cell cell = row.getCell(0); // 첫 번째 열에 이름이 있다고 가정
            if (cell != null && cell.getCellType() == CellType.STRING) {
                applicants.add(cell.getStringCellValue().trim());
            }
        }
        workbook.close();
        fis.close();

        // 2. 추첨 인원 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("당첨자 수를 입력하세요: ");
        int winnersCount = sc.nextInt();

        if (winnersCount > applicants.size()) {
            System.out.println("당첨자 수가 응모자 수보다 많을 수 없습니다.");
            return;
        }

        // 3. 무작위 추첨
        Collections.shuffle(applicants);
        List<String> winners = applicants.subList(0, winnersCount);

        // 4. 결과 출력
        System.out.println("\n=== 당첨자 명단 ===");
        for (String winner : winners) {
            System.out.println(winner);
        }
    }
}
