package 컬렉션기본;

public class 제네릭프로그래밍 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-------------------------------------------------------------------
		Truck<String, Integer> t1 = new Truck<>();		
		Truck<Integer, String> t2 = new Truck<>();		
		
		t1.weight = "중량무게";
		t1.distance = 100;
		
		t2.weight = 1000;
		t2.distance = "장거리";
		
		System.out.println(t1);
		System.out.println(t2);
		
		//------------------------------------------------------------------

	}

}
