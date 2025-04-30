# 📘 Chapter 01 - 자바스크립트 소개와 기본 문법

## 자바스크립트란?
웹 브라우저에서 동작하는 대표적인 프로그래밍 언어. HTML, CSS와 함께 프론트엔드의 핵심 3요소 중 하나.  
요즘은 Node.js 덕분에 백엔드에서도 사용됨.  

## 변수 선언 (var, let, const)
```js
var a = 10; // 함수 범위
let b = 20; // 블록 범위
const c = 30; // 상수
```

`let`과 `const`를 주로 사용하는 추세. `var`는 과거 방식.

## 데이터 타입
- 숫자 (number)
- 문자열 (string)
- 불리언 (boolean)
- null
- undefined
- 객체 (object)
- 배열 (array)
- 함수 (function)

```js
let name = "JS";
let age = 20;
let isStudent = true;
```

## 출력
```js
console.log("Hello, JavaScript!");
```

## 연산자
```js
let x = 10;
let y = 3;

console.log(x + y); // 13
console.log(x % y); // 1
console.log(x == "10"); // true (값만 비교)
console.log(x === "10"); // false (값과 타입 둘 다 비교)
```
