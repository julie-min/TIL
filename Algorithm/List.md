# List 리스트
- 순서 O 중복 O

1. ArrayList
2. LinkedList
3. Stack

---

`ArrayList<String> al = new ArrayList<>();`
<br>
- al. add("130")
- al. get(0)
- al. size()
- al. contains("130")
- al. remove(0)
- al. sort(Comparator.naturalOrder())
- al. sort(Comparator.reverseOrder())

### ArrayList의 특징
1. 모든 타입을 넣을 수 있다.
2. 순서가 있다.
3. 중복이 있다.
---

`LinkedList<String> li = new LinkedList<>()`
<br>
### LinkedList
1. 중간 데이터를 추가/삭제하는 경우 빠르다.
2. 데이터 개수가 많아질수록 접근시간이 길어진다.
