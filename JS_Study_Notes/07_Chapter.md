# 📘 Chapter 07 - ES6 문법 요약

## let, const
재선언 금지, 블록 스코프

## 템플릿 문자열
```js
let name = "JS";
console.log(`Hello, ${name}!`);
```

## 구조 분해 할당
```js
let [a, b] = [1, 2];
let {x, y} = {x: 10, y: 20};
```

## 스프레드 연산자
```js
let arr = [1, 2];
let newArr = [...arr, 3, 4]; // [1, 2, 3, 4]
```

## 클래스
```js
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(this.name + " makes a noise.");
  }
}

let dog = new Animal("Dog");
dog.speak();
```
