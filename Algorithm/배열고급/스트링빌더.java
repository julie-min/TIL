package 배열고급;

public class 스트링빌더 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); //------------------ 문자열 비교, "같음" 
		
		s2 = "hahahaha";
		System.out.println(s == s2); // 같지 않음
		
		StringBuilder sb = new StringBuilder("honghong");
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb == sb2); //------------------ 스트링빌더 비교, "다름"
		
		sb.append("hahahaha");
		System.out.println(sb); // 홍홍+하하=홍홍하하
		sb2.replace(0, 8, "hahahaha");
		System.out.println(sb2); // 아예 교체해서 하하만 나옴
		sb.delete(0, 4);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
