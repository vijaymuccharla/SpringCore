package in.vijay.comps;

public class One {

	private Two t;
	
	//Constructor injection using 1-param
	public One(Two t) {
		System.out.println("One : 1-param const");
		this.t = t;
	}
		
	//toString
	@Override
	public String toString() {
		return "One [t=" + t + "]";
	}
	
}
