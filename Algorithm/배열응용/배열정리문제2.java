package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
		
		//--------------------------------------------------------------------   int값 5개 입력받기

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		//--------------------------------------------------------------------- 최소값 구하기
		
		Arrays.sort(num);
		System.out.println(num[0]);
		
	}

}