package 컬렉션기본;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션구분 {

	public static void main(String[] args) {

		// -------------------------------------------------------------- 팀을 구성해서 한명씩 넣는다. (중복  X) 
		//  중복이 되면 안들어가는 HashSet
		
		HashSet<String> team = new HashSet<>();  // String 만을 모아놓은 team이라는 중복제거한 모음
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("프로그래머");
		System.out.println(team);
		
		// 나중에 어떻게 활용할까? 배열이 주어지고, 중복을 제거하고 갯수를 세라고 할때!
		
		
		// -------------------------------------------------------------- 냉장고에 FIFO
		// 선입선출 => Queue
		
		LinkedList<String> Ref = new LinkedList<String>();
		Ref.add("상한우유");
		Ref.add("싱싱우유");
		System.out.println(Ref);
		
		Ref.remove(); // 무얼 빼라고 말한적 없다..
		System.out.println(Ref); // [싱싱우유] 만이 남는다.
		
		// -------------------------------------------------------------- 순서가 있는 CRUD 가능한 리스트
		
		ArrayList<String> ski = new ArrayList<String>();
		ski.add("박일등");
		ski.add("김이등");
		ski.add("이삼등");
		ski.add("박사등");
		System.out.println(ski);
		
		ski.remove(0); // 1등이 빠졌답니다.
		ski.add(0,  "낙하산"); //낙하산이 갑자기 1등을 했다고합니다.
		System.out.println(ski);
		System.out.println(ski.get(0)); // 누가 1등이지?
		System.out.println(ski.indexOf("이삼등")); // 이삼등은 몇번째지?
		
		// -------------------------------------------------------------- 단축키 문제
		
		HashMap<Integer, String> phone = new HashMap<>();
		phone.put(1, "엄마");
		 System.out.println(phone);
		 phone.put(2, "아빠");
		 phone.put(3, "짝꿍");
		 phone.put(4, "동생");
		 System.out.println(phone);
		 System.out.println(phone.get(1));
		 phone.put(3, "형"); // 아이고 이름을 잘못입력했네 => 다시 입력
		 System.out.println(phone);
		 phone.getOrDefault(5, "밍밍이"); // 5번이 있는지 찾고 없으면 그냥 조회
		 System.out.println(phone);
		
		
	}

}
