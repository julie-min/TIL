package 배열응용;

import java.util.Arrays;

public class 배열정리문제6 {

	public static void main(String[] args) {
		

		String s5 = "[10 ,20, 30, 40, 50]";
		
		//--------------------------------------------------------------------  [] 제거 : replace 사용
		
		String s6 = s5.replace("[","");
		String s7 = s6.replace("]","");
		System.out.println(s7);

		//--------------------------------------------------------------------- 띄어쓰기 제거
		
		s7 = s7.trim();
		System.out.println(s7);
		
		//--------------------------------------------------------------------- 잘라서 배열로 넣기

		String[] s8 = s7.split(", ");
		System.out.println(Arrays.toString(s8));
		
		int sum=0;
		int[] num3 = null;
		for (int i = 0; i < s8.length; i++) {
		num3[i] = Integer.parseInt(s8[i]);
		}
		
		System.out.println(Arrays.toString(num3));
	}

}