package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 배열에서최소값구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 배열에 뭘 넣어야할지 몰라요? => 빈 배열 공간 먼저 확보
		// 랜덤한 값 1000개를 발생시켜 배열에 넣고
		// 1. 최소값을 구하고, 순서도를 만든다. 0~999 범위의 값
		// 2. 최대값을 구해보세요.
		// 3. 최대값의 갯수는?
		
		
		int[] s = new int[1000];
		
		Random r = new Random(42);
		
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999)+1; // 0~999 => 1~1000 (+1하면)
			
			// r.nextInt (바운더리 최대값보다 1큰값) 
		}
		
		
		System.out.println(Arrays.toString(s));
		
		// ----------------------------------------------------------------------- 배열에 값 넣기 완료
		
		int max = s[0];
		
		for (int x: s) {
			if(x > max) {
				max = x;
			}
		}
		
		System.out.println("최대값은 "+max);
		
		
		// ------------------------------------------------------------------------  최대값이 몇개인지 카운트해보자
		
		int count = 0; 
		for (int x: s) {
			if(x == max) {
				count++;
			}
		}
		
		System.out.println("최대값의 개수는 "+count+"개");
		
		
	}

}
