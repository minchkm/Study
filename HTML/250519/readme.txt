index.html : 하나의 포맷에 배열 객체를 데이터를 이용하여 자바스크립트로 반복하여 화면 구현
index copy.html : xmlHttpRequest객체를 이용하여 json데이터 받아 처리

find.html : ?id=2 파라메다를 이용하여 다른페이지에 정보 전달
findproc.html : 
    파라메다 전달 처리 : new URLSearchParams(location.search)
    문자열로 전달된 JSON을 객체로 변환 : JSON.parse(xmlhttp.responseText)
    다른페이지 정보 전달을 위한 객체 : cookie, localStorage, sessionStorage
findprocmove.html: 전달된 객체를 개발자도구(f12)의 console, network, application에서 확인

view.html : 디자인 참고

추가적으로 알아야하는 사항:
팀프로젝트 간에 페이지별로 
style,javascript을 어떻게 개별적으로 작성할 것인가?webpack

작성한 파일을 어떻게 한 곳에 모아서 서비스할 것인가?github