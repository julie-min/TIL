package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자 {

	public static void main(String[] args) {
		String s = "aaabbbcdddefe";
		// 중복된거 제거한 컬렉션을 만들어보세요.

		HashSet<String> set = new HashSet<>();
		// char에 대한 처리가 필요없고
		// 데이터양이 많지 않으면
		// 그냥 String으로 해도 괜찮다.!
		// 문자열을 String[]로 만들어보자.
		String[] s2 = s.split("");
		System.out.println(Arrays.toString(s2));
		// 문자열을 char[]로 만드는 방법도 있다.!
		// hashset에 넣어서 중복을 제거한 목록을 만든 후 프린트
		for (String x : s2) {
			set.add(x);
		}
		System.out.println(set);// [a, b, c, d, e, f]
		// set은 for-each를 허용
		for (String x : set) {
			System.out.println(x);
		}

//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.get(i));//사용불가!
//		}

		// list를 이용해서 중복을 제거한 목록을 만든 후 프린트
		// String[] s2 = [a, a, a, b, b, b, c, d, d, d, e, f, e]
		ArrayList<String> list = new ArrayList<String>();
		for (String x : s2) { // 배열을 꺼내는 for
			if (!list.contains(x)) { // 이미 list에 들어가지 않은 것만 넣자.!
				list.add(x);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		// Collections.sort(set);

		String answer2 = "";
		for (String x : list) {
			answer2 += x;
		}
		System.out.println(answer2);

		String answer = String.join("", list); // abcdef
		// String answer = String.join("-", list); //a-b-c-d-e-f
		System.out.println(answer);

		ArrayList<String> list2 = new ArrayList<String>();
		if (list2.size() != 0) {
			for (String x : list2) {
				System.out.println(x);
			}
		}

		System.out.println("------------------");

		Iterator<String> iterator = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			String x = iterator.next();// 하나씩 꺼내줄때 사용!
			// iterator.hasNext(); 있는지 없는지 체크가능!
			System.out.println(x);
		}
		System.out.println("------------------");
		// 전체 어떤 문자들이 있는지 set을 통해서 목록을 얻음.
		// 이 목록안에 들어있는 문자가 각각 몇개씩 있는지 체크해서
		// 1개인것만 찾아서 모으세요.!!!
		System.out.println(Collections.frequency(list, "c"));

		
		String s3 = "aaabbbcdddefe";
		//String에 있는 값들을 하나씩 분리한 후, 
		//중복 제거 리스트를 구해서
		//전체 목록에서 각 글자가 몇 개씩 나오는지 확인(1인 것만 목록 만드세요.)
		//정렬한후, String으로 모으세요.!
		
		String[] s4 = s3.split("");
		List<String> list3 = (List<String>)Arrays.asList(s4);
		
		HashSet<String> set2 = new HashSet<String>();
		for (String x : s4) {
			set2.add(x); //[a, b, c, d, e, f]
		}
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (String x : set2) {
			if(Collections.frequency(list3, x) == 1) {
				result.add(x);
			}
		}
		Collections.sort(result);
		String answer3 = String.join("", result);
		System.out.println(answer3);
	}
}