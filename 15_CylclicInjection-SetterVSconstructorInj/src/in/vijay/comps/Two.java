package in.vijay.comps;

public class Two {

	private One on;
	
	//Constructor injection using 1-param
	public Two(One on) {

		System.out.println("Two : 1-param Const");
		this.on = on;
	}
	//toString
	@Override
	public String toString() {
		return "Two [on=" + "]";
	}
	
}
