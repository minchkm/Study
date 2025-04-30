# 📘 Chapter 05 - 객체와 this 키워드

## 객체 생성
```js
let person = {
  name: "John",
  age: 30,
  greet: function() {
    console.log("Hi, I'm " + this.name);
  }
};

person.greet();
```

## 객체 접근/수정
```js
console.log(person.name);  // John
person.age = 31;
```

## this 키워드
```js
const obj = {
  value: 42,
  getValue: function() {
    return this.value;
  }
};
```
