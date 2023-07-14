package 배열핵심;

import java.util.Arrays;
import java.util.List;

public class 스트링을배열로2 {

	public static void main(String[] args) {

		// -------------------------------------------------------------------------------- 문자열 >> 배열

		String s = "국어, 영어, 수학, 컴퓨터";
		String[] s2 = s.split(", "); //공백도 같이 넣으면 공백도 없어진 상태로 배열에 넣게된다..
		System.out.println(Arrays.toString(s2));

		// -------------------------------------------------------------------------------- 과목수 구하기
		
		System.out.println(s2.length); // 배열의 갯수 구하는 방법
		
		
		// -------------------------------------------------------------------------------- 컴퓨터 과목은 몇번째일까 = 너 컴퓨터야?
		
		for (int i = 0; i < s2.length; i++) {
			if(s2[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}
				
	    // -------------------------------------------------------------------------------- 과목명이 3글자 미만인 과목의 갯수
		
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			if(s2[i].length() < 3) {     // ------------------------ 배열 중의 하나, 길이 재는 방법
				count++;
			}
		}
		System.out.println(count);
		
		// --------------------------------------------------------------------------------- List 만들기
		
		List<String> list = Arrays.asList (s2);  // s2를 리스트로 만들어주세요.
		System.out.println(list.indexOf("컴퓨터"));
	}
}
