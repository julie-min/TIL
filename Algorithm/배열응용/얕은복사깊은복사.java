package 배열응용;

import java.util.Arrays;

public class 얕은복사깊은복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n1 = {100, 20, 30}; //1학기 성적
		int[] n2 = n1.clone();  //2학기 성적
		n2[0] = 90; // 2학기때 1학기랑 똑같은데, 첫번째 값만 떨어졌어.
		
		System.out.println("1학기 "+ Arrays.toString(n1));
		System.out.println("2학기 "+ Arrays.toString(n2));
		
		System.out.println(n1 == n2);
		System.out.println(Arrays.equals(n1, n2));

	}

}
