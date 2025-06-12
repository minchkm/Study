##jscode import하기
index.html : 이파일에 js를 포함하여 콘솔에서 자바스크립트 코드를 확인한다.

##객체를 접근하는 방법 
json.js : json형식과 객체형식의 차이점에 대해 이해

##ajax(비동기 통신)를 이용하여 xml,json파일을 가져오기
ajax.js : XMLHttpRequest객체를 생성하고 파일의 내용을 수신하기
수신된 내용을 화면에 나타내기(반복문사용법 포함)

##전송되는 파일 형식(xml,json)
책에 대한 형식을 두 형식으로 알아보고 표현하기

##연습문제
findbook.html파일 참조
추가적인 사항 : result=books.find(book=> book.title === search);
정규식으로 찾기 " 
let regex = new RegExp(search, 'i'); //문자열을 정규식으로 변환 /javascript/i
var result = books.find(book => regex.test(book.title));
or
var result = books.filter(book => regex.test(book.title));

##자바스크립트를 이용하여 테이블에 객체를 만들고 직접 추가하기
tableadd.html : 클래스 추가, 부스트랩활용
