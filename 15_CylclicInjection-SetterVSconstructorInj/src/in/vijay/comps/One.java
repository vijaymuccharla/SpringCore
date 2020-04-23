package in.vijay.comps;

public class One {

	private Two t;
	
	//0-param
	public One() {
		System.out.println("One : 0-param construcor");
	}
		
	//setternjection
	public void setT(Two t) {
		this.t = t;
	}

	//toString
	@Override
	public String toString() {
		return "One [t=" + t + "]";
	}
	
}
