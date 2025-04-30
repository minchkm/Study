# 📘 Chapter 06 - DOM 조작

## 요소 선택
```js
let title = document.getElementById("title");
let items = document.querySelectorAll(".item");
```

## 내용 변경
```js
title.textContent = "새 제목";
```

## 요소 스타일 변경
```js
title.style.color = "red";
```

## 이벤트 처리
```js
let btn = document.querySelector("button");
btn.addEventListener("click", function() {
  alert("클릭됨!");
});
```
