package 컬렉션기본;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class 중복제거처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-------------------------------------------------------------------1000개의 랜덤숫자를 발생
		Random r = new Random(55);
		int[] num = new int[1000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		
		System.out.println(Arrays.toString(num));
		
		//------------------------------------------------------------------ 중복 제거
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set.size()); // 중복이 제거된 개수
		System.out.println(set);
		
		//------------------------------------------------------------------

	}

}
