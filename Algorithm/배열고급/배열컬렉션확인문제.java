package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 배열컬렉션확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s3 = {"박명수","유재석","김종국","송지효","하하"};
		// size를 변경하기 위해서는 새로운 ArrayList를 만드는 것이 좋음
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s3));
		
		// 오름차순으로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 내림차순 = 역정렬
		Collections.reverse(list);
		System.out.println(list);
		
		// 글자수가 3미만인 사람 삭제
		String under3 = "";
		for (String x : list) {
			if(x.length() < 3) {
				under3 = x;
			}
		}
		list.remove(under3);
		System.out.println(list);
		
		// 만약, 글자수가 3미만인것이 여러개 인경우
		// 1. String에 붙여서 프린트
		// 2. 크기고정 여러개 => 배열사용
		// 3. 크기고정X 여러개 => 컬렉션
		System.out.println(list.add("박명수"));
		System.out.println(list);
		
		// 박명수가 있는 위치를 골라내자. 박명수는 2곳에 있다.
		// 1. String에 붙여서 프린트
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("박명수")) {
					result += i + " ";
			}
		}
		System.out.println(result);
		
		//2. 크기고정X 여러개 --> 컬렉션 {2, 4}
		ArrayList<Integer> result2 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("박명수")) {
				result2.add(i);
			}
		}
		System.out.println(result2);
		//3. 크기고정 여러개 --> 배열 {2, 4}
		int[] result3 = new int[result2.size()];
		for (int i = 0; i < result2.size(); i++) {
			result3[i] = result2.get(i);
		}
		System.out.println(Arrays.toString(result3));
		
		
		// 유재석을 유재돌로 변경
		int index = list.indexOf("유재석"); // 유재석이 있는곳 찾기
		System.out.println(index);
		list.set(index, "유재돌");
		System.out.println(list);
		
		// 전체 목록에 김종민을 3번째에 추가 (중간에 삽입한다)
		list.add(2, "김종민");
		System.out.println(list);
		
		// int를 String으로 바꾸는 방법
		// 1. String.valueOf(int값)
		// 2. int값 + " "
		
		//int --> String 
				//1) String.valueOf(int값)
				//2) int값 + ""
				String num = null;
				String num2 = num + "";
				String find = null;
				String find2 = find + "";
				int answer = -1;
				if(num2.contains(find2)) {
					answer = num2.indexOf(find2) + 1;
	}

}
}
