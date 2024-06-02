JSTL 문법의 for문 사용법

<c:forEach items="${리스트가 받아올 배열이름}" var=$"{for문안에서 사용할 변수}" varStatus="status">

 

status 는 for문의 돌아가는 상태를 알 수 있게 체크하여 준다

#{status.current}   현재의 for문에 해당하는 번호

#{status.index} 0부터의 순서

#{status.count} 1부터의 순서

#{status.first}  현재 루프가 처음인지 확인

#{status.last}  현재 루프가 마지막인지 확인

#{status.begin} for문의 시작 값

#{status.end}   for문의 끝 값

#{status.step}  for문의 증가값