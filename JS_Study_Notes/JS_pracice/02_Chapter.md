# 📘 Chapter 02 - 조건문과 반복문

## if, else if, else
```js
let score = 85;
if (score >= 90) {
  console.log("A");
} else if (score >= 80) {
  console.log("B");
} else {
  console.log("C");
}
```

## switch문
```js
let fruit = "apple";
switch (fruit) {
  case "apple":
    console.log("사과입니다");
    break;
  case "banana":
    console.log("바나나입니다");
    break;
  default:
    console.log("모르겠음");
}
```

## 반복문
```js
for (let i = 0; i < 5; i++) {
  console.log(i);
}

let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}

i = 0;
do {
  console.log(i);
  i++;
} while (i < 5);
```
