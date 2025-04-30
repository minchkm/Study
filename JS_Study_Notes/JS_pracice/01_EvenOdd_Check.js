// 1. 짝수/홀수 판별기
function checkEvenOdd(num) {
  if (num % 2 === 0) {
    return "짝수입니다.";
  } else {
    return "홀수입니다.";
  }
}

console.log(checkEvenOdd(3));  // 홀수입니다.
