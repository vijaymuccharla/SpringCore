package in.vijay.comps;

public class Two {

	private One on;
	
	//0-param
	public Two() {
		System.out.println("Two : 0-param contructor");
	}
	
	//setter
	public void setOn(One on) {
		this.on = on;
	}
	
	//toString
	@Override
	public String toString() {
		return "Two [on=" + on + "]";
	}


}
