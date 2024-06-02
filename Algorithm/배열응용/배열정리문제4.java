package 배열응용;


public class 배열정리문제4 {

	public static void main(String[] args) {
		

		String s1 = "참좋다";
		String s2 = "진짜좋다";
		String s3 = "딱좋다";
		
		//--------------------------------------------------------------------  문자열이 동일한지 확인
		
		System.out.println(s1 == s2);

		//--------------------------------------------------------------------- 문자열 글자수 구하기
		
		int s11 = s1.length();
		int s22 = s2.length();
		int s33 = s3.length();
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s11 == s33);
		System.out.println(s1.equals(s3));
		
		
		
	}

}