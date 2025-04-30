# 📘 Chapter 03 - 함수

## 기본 함수 선언
```js
function greet(name) {
  return "Hello, " + name;
}

console.log(greet("Alice")); // Hello, Alice
```

## 화살표 함수
```js
const add = (a, b) => a + b;
console.log(add(2, 3)); // 5
```

## 매개변수 기본값
```js
function sayHi(name = "익명") {
  console.log("안녕, " + name);
}
sayHi();
```

## 함수 표현식
```js
const square = function(x) {
  return x * x;
};
```
