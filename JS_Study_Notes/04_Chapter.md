# 📘 Chapter 04 - 배열과 반복 처리

## 배열 선언과 사용
```js
let fruits = ["apple", "banana", "cherry"];
console.log(fruits[0]); // apple
```

## 배열 메서드
```js
fruits.push("orange"); // 추가
fruits.pop();          // 마지막 제거
fruits.shift();        // 첫 번째 제거
fruits.unshift("grape"); // 첫 번째 추가
```

## 반복 처리
```js
fruits.forEach(function(item, index) {
  console.log(index, item);
});

let upper = fruits.map(f => f.toUpperCase());
```
