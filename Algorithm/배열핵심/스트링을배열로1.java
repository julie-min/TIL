package 배열핵심;

import java.util.Arrays;

public class 스트링을배열로1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// -------------------------------------------------------------------------------- 문자열
		
		// "감자, 고구마, 감자, 감자, 고구마" => 여기서 감자가 몇개인지 알아보세요
		// 스트링 배열로 변환 String[]
		
		String s = "감자,고구마,감자,감자,고구마";
		String[] s2 = s.split(","); // 쉼표를 기준으로 분리시켜라.
		System.out.println(Arrays.toString(s2));
		
		// -------------------------------------------------------------------------------- 분리완료
		
		int count = 0;
		for (String x : s2) {  // 하나씩 x에 넣는다.
			if(x.equals("감자")) {  // 너 감자야? 라고 묻는다. 
				count++;
			}
		}
		System.out.println("감자의 개수 "+count);
		
		// -------------------------------------------------------------------------------- 문자
		
		String s3 = "김수안무동방석차";
		char[] c = s3.toCharArray();
		System.out.println(Arrays.toString(c));
		int count2 = 0;
		for (char x : c) {
			if (x == '김' || x == '동' || x == '석') {
				count2++;
			}
		}
		System.out.println("김, 동, 석의 개수: " + count2);
		
		char c2 = s3.charAt(0); // index를 주고 특정한 char를 추출 가능
		System.out.println("이 사람의 성은 "+c2);
	}

}
