package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 배열정리문제3 {

	public static void main(String[] args) {
		
		//--------------------------------------------------------------------  랜덤한 값 20개 발생시키기

		int[] num = new int[20];
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(900);
		}
		
		System.out.println(Arrays.toString(num));

		//--------------------------------------------------------------------- 최소값 구하기
		
		Arrays.sort(num);
		System.out.println("최대값: "+num[num.length-1]);
		
	}

}