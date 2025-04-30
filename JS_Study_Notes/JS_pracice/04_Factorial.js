// 4. 팩토리얼 함수 만들기
function factorial(n) {
  if (n <= 1) return 1;
  return n * factorial(n - 1);
}

console.log(factorial(5));  // 120
