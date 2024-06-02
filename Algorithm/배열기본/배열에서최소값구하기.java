package 배열기본;

public class 배열에서최소값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = { 90, 80, 20, 60, 70 };
		
		// 1. 최소값만을 남기는 객체를 하나 만든다.
		
		int min = s[0];
		
		
		// 2. for문으로 반복하면서 자리마다 방문한다.
		
		for (int x : s) {
			
			
		// 3. if 조건으로 너 나보다 작아? 작으면 너를 먹어야겠다 냠
			
			if (x < min) {
				
				
		// 4. 마지막까지 반복하고, 마지막 결과를 출력
		
		
				min = x;
			} //if
		}//for

		System.out.println("최소값>> "+ min);
		
	}

}
