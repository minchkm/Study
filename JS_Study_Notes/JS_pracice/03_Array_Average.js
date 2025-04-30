// 3. 배열 평균 구하기
function average(arr) {
  let sum = arr.reduce((acc, cur) => acc + cur, 0);
  return sum / arr.length;
}

console.log(average([10, 20, 30]));  // 20
