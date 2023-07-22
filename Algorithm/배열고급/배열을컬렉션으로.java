package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		//	중복된 것을 제거하고 싶은 경우
		//1. hashset사용
		//2. 하나씩 꺼내서 for문 돌려 equals  
		//   ==> 중복된 것을 원본에서 지우고 싶다.!
		//   ==> 배열에서 원소값을 제거불가!(사이즈 고정)
		//   ==> 배열에 들어있는 값을 추가하거나 삭제하는 경우 
		//      컬렉션으로 변경해서 작업하면 편하다.
		//      가변, 타입도 유동적으로 적합 
		//java코드에서 자동 import(컨트롤 + 쉬프트 + o)
		//마우스를 hover(f2)해서 import선택 
	    List<String> list = Arrays.asList(s2); 
	    //asList는 실제로는 array를 list로 다루는  방법을 사용한다. 
	    //검색, 수정, 정렬, 역정렬도 가능!!
	    System.out.println(list);
	    System.out.println(list.get(0)); //검색 
	    System.out.println(list.size());
	    list.set(0, "ddd"); //수정 
	    System.out.println(list);
	    //컬렉션으로 변경하면 Collections라이브러리 사용 가능
	    Collections.sort(list); //Arrays.soft()오름차순 정렬 
	    System.out.println(list);
	    Collections.reverse(list); //list의 값들 거꾸로 넣어줌.역순정렬 
	    System.out.println(list);
	    
	    ///////////////////////////////////////////////////////
	    //Exception in thread "main" java.lang.UnsupportedOperationException
//		at java.util.AbstractList.add(AbstractList.java:148)
//		at java.util.AbstractList.add(AbstractList.java:108)
//		at 배열고급.배열을컬렉션으로1.main(배열을컬렉션으로1.java:26)
	   // ==> 사이즈 변경하는 기능 불가 
	    //list.add("eee"); //Arrays.asList(s2); 
	    //list.remove(0);
	    //remove(), add()같은 list의 size()를 조절하는 기능을 사용하고 싶으면
	    //오리지널 arraylist를 만들면 된다.
	    ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s2));
	    //ArrayList<String> list2 = new ArrayList<String>(컬렉션);
	    //컬렉션의 목록으로 arraylist를 만들어준다.!
	    System.out.println(list2.size());
	    System.out.println(list2);
	    list2.add("eee");
	    list2.remove(0);
	    System.out.println(list2);
	}

}