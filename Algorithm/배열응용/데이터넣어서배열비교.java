package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 데이터넣어서배열비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Random r = new Random();
		
		int[] num1 = new int[1000];
		int[] num2 = new int[1000];
		
		for (int i = 0; i < num1.length; i++) {
			num1[i] = r.nextInt(1000); // 0~999
			num2[i] = r.nextInt(1000); // 0~999
			
			// r.nextInt (바운더리 최대값보다 1큰값) 
		}
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		// ----------------------------------------------------------------------- 배열에 값 넣기 완료
		
		
		System.out.println(num1 == num1); // 참조형 변수를 비교연산자(==)로 비교: 주소를 비교한 것이다.
		System.out.println(num1 == num2); // 참조형 변수를 비교연산자(==)로 비교: 주소를 비교한 것이다.
		
		System.out.println(Arrays.equals(num1, num1));

		// -----------------------------------------------------------------------
		
		// 즉, 배열을 비교할 때에는 Arrays.equals를 사용한다.
		
	}

}
