# 📘 Chapter 10 - 파일 입출력

## 파일 쓰기
```c
FILE *fp = fopen("test.txt", "w");
fprintf(fp, "Hello File!\n");
fclose(fp);
```

## 파일 읽기
```c
char buffer[100];
FILE *fp = fopen("test.txt", "r");
fgets(buffer, 100, fp);
printf("%s", buffer);
fclose(fp);
```
