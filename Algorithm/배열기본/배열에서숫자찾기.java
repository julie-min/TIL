package 배열기본;

import java.util.*;

public class 배열에서숫자찾기 {

	public static void main(String[] args) {
		
		double[] num = new double[5];  // 가장 먼저 저장공간을 준비 
		Scanner sc = new Scanner(System.in); // 입력하는 부품의 객체 생성
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble(); // 자리를 돌아다니면서 입력받아서 넣기
		}
		
		// ---------------------------------------------------------------  입력완료 
		
		
		// 배열을 출력하는 방법
		System.out.println(Arrays.toString(num));
		
		
		//----------------------------------------------------------------  확인완료
		
		// 22.2가 있는 위치를 출력하는 방법
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 22.2) { // 너 22.2 이냐?
				System.out.println(i);
			}
			if(num[i] == 33.3) { // 너 33.3 이냐?
				System.out.println(i);
			}
			
		}		
		
		// 해당 숫자가 몇개 있는지 찾는 방법 -------------------------- 카운트는 누적이다!
		
		int count = 0; // 누적시킬 목적으로 count, sum 변수들은 반복문 밖에서 만들어줘야함. 반복문 안에 있으면 초기화된다.
		for (double d : num) {
			if(d == 22.2) {
				count++;
			}	
		}
		System.out.println("22.2의 갯수는 " + count);
	}

}