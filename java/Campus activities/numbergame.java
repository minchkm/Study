import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuessingGameGUI extends JFrame {
    private int answer, min, max, maxTries, tries, bestScore = Integer.MAX_VALUE;
    private Random rand = new Random();
    private JTextField inputField;
    private JLabel messageLabel, triesLabel, bestLabel;
    private JButton guessButton, restartButton;
    private JComboBox<String> levelBox;

    public NumberGuessingGameGUI() {
        setTitle("숫자 맞추기 게임 (GUI)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(new GridLayout(7, 1));

        // 난이도 선택
        JPanel levelPanel = new JPanel();
        levelPanel.add(new JLabel("난이도: "));
        String[] levels = {"쉬움 (1~50, 10회)", "보통 (1~100, 7회)", "어려움 (1~500, 5회)"};
        levelBox = new JComboBox<>(levels);
        levelPanel.add(levelBox);
        add(levelPanel);

        messageLabel = new JLabel("난이도를 선택하고 게임을 시작하세요!", SwingConstants.CENTER);
        add(messageLabel);

        inputField = new JTextField();
        add(inputField);

        guessButton = new JButton("입력");
        add(guessButton);

        triesLabel = new JLabel("시도: 0 / 0", SwingConstants.CENTER);
        add(triesLabel);

        bestLabel = new JLabel("최고 기록: -", SwingConstants.CENTER);
        add(bestLabel);

        restartButton = new JButton("게임 재시작");
        add(restartButton);

        // 이벤트 리스너
        levelBox.addActionListener(e -> startGame());
        guessButton.addActionListener(e -> checkGuess());
        restartButton.addActionListener(e -> startGame());
        inputField.addActionListener(e -> checkGuess());

        startGame();
        setVisible(true);
    }

    private void startGame() {
        int level = levelBox.getSelectedIndex();
        switch (level) {
            case 0: min = 1; max = 50; maxTries = 10; break;
            case 2: min = 1; max = 500; maxTries = 5; break;
            default: min = 1; max = 100; maxTries = 7;
        }
        answer = rand.nextInt(max - min + 1) + min;
        tries = 0;
        messageLabel.setText(min + "~" + max + " 사이의 숫자를 맞혀보세요!");
        triesLabel.setText("시도: 0 / " + maxTries);
        inputField.setText("");
        inputField.setEditable(true);
        guessButton.setEnabled(true);
    }

    private void checkGuess() {
        String text = inputField.getText().trim();
        int guess;
        try {
            guess = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            messageLabel.setText("숫자만 입력하세요!");
            return;
        }
        if (guess < min || guess > max) {
            messageLabel.setText(min + "~" + max + " 사이의 숫자만 입력!");
            return;
        }
        tries++;
        triesLabel.setText("시도: " + tries + " / " + maxTries);
        if (guess > answer) {
            messageLabel.setText("Down!");
        } else if (guess < answer) {
            messageLabel.setText("Up!");
        } else {
            messageLabel.setText("정답! 시도 횟수: " + tries);
            if (tries < bestScore) {
                bestScore = tries;
                bestLabel.setText("최고 기록: " + bestScore + "회");
            }
            inputField.setEditable(false);
            guessButton.setEnabled(false);
            return;
        }
        if (tries >= maxTries) {
            messageLabel.setText("실패! 정답은 " + answer + "");
            inputField.setEditable(false);
            guessButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NumberGuessingGameGUI::new);
    }
}
