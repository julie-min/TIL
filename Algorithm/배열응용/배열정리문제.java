package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1. 순차문(입력<-- 데이터 가지고 오는 것)
		// 외부입력해서, 배열에 저장
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		// 2. 순차문(처리<-- 정렬, 인덱스)
		// 정렬, 인덱스 찾아보는 처리
		Arrays.sort(num);// 오름차순

		// 3. 순차문(출력)
		System.out.println(num[0] + " " + num[num.length -1]);

		System.out.println("================");
		//처리 --> 출력 
		int min = num[0];
		int max = num[num.length -1];
		
		//index누적시켜서 프린트하려고 함.
		String minIdx = ""; //0 1 
		String maxIdx = "";
		for (int i = 0; i < num.length; i++) {
			if(num[i] == min) {
				minIdx += i + " "; //minIdx = minIdx + i
			}
			if(num[i] == max) {
				maxIdx += i + " "; //maxIdx = maxIdx + i
			}
		}
		
		System.out.println("최소값의 위치는 >> " + minIdx);
		System.out.println("최대값의 위치는 >> " + maxIdx);
		
		
		
	}

}