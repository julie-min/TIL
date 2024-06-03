# Denomalization
- 반정규화, 역정규화 (이는 비 정규화와 다르다.)
- 정규화를 하긴 했는데, 다시 돌아오는 것.
- 정규화를 하고 났더나 성능이 좋지않아서, 반정규화

-클러스터링: 자주 사용되는 테이블의 데이터를 디스크 같은 블록에 저장한다.

# 반정규화 기법
1. 칼럼 반정규화
   - 중복칼럼 추가 : 테이블에서 자주 사용하는 칼럼을 중복시킴
   - 파생칼럼 추가
   - 이력테이블칼럼 추가
   - PK의 의미적 분리를 위한 칼럼 추가
   - 데이터복구를 위한 칼럼추가
  

2. 테이블 반정규화
   - 테이블 병합
   - 테이블 분할
   - 테이블 추가
