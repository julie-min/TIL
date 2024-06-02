package 배열기본;

import java.util.Arrays;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열만들때
		// 1. 이미 값을 알고 있는 경우
		int[] ages = { 60, 50, 30, 20, 10 };
		System.out.println(ages);
		//ages가 가르키고 있는 데이터들 프린트하는 방법 :
		// 1. for문
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i]+" ");
		}
		for (int x : ages) {
			System.out.print(x+ " ");
			
		}
		// 2. 함수를 사용
		System.out.println(Arrays.toString(ages));
		// 참조형 변수가 가르키고 있는 heap영의 데이터를
		// String으로 만들어주는 함수

		// 2. 값을 모르고 있는 경우
		// 공간을 만들고, 값은 나중에 넣는다.
		double[] weight = new double[5]; // heap영역에 공간 5개를 만든다.
		// 배열의 공간을 만들면 heap영역에 0으로 초기화를 한다. {0, 0, 0, 0, 0, 5}
		//{0,1,2,3,4,length} => {0,0,0,0,0,5}
		weight[0] = 55;
		weight[1] = 40;
		weight[2] = 50;
		weight[3] = 60;
		weight[4] = 42;

	}

}
