// 7. 간단한 계산기
function calculate(a, b, operator) {
  switch (operator) {
    case '+': return a + b;
    case '-': return a - b;
    case '*': return a * b;
    case '/': return b !== 0 ? a / b : "0으로 나눌 수 없음";
    default: return "지원하지 않는 연산자입니다.";
  }
}

console.log(calculate(5, 3, '+'));  // 8
