package 컬렉션기본;

public class Truck<T1, T2> {

	T1 weight;
	T2 distance;
	
	
	@Override
	public String toString() {
		return "Truck [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
