package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 배열을정렬하여최대최소구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] s = new int[1000];
		
		Random r = new Random(42);
		
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999)+1; // 0~999 => 1~1000 (+1하면)
			
			// r.nextInt (바운더리 최대값보다 1큰값) 
		}
		
		
		System.out.println(Arrays.toString(s));
		
		// ----------------------------------------------------------------------- 배열에 값 넣기 완료
		
		Arrays.sort(s);  // 오름차순 정렬 => 원본을 바꿔버린다고 하여 '파괴함수'라고 불린다.
		
		System.out.println(Arrays.toString(s)); 
		
		
		// ------------------------------------------------------------------------  최대, 최소값 찾아보기
		
		System.out.println("최소값"+s[0]);
		System.out.println("최대값"+s[s.length-1]);
	
		
	}

}
