package 배열기본;

import java.util.*;

public class 배열랜덤데이터넣기 {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(101)); //-21~21 --> 0~100
		int[] num = new int[1000]; //1002개 변수, 0,0,0,0,0,0,0,0,0,0,0,0
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(101);
		}
		System.out.println(Arrays.toString(num));
	}

}