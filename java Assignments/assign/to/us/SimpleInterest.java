package assign.to.us;

public class SimpleInterest {
	static int calculateSI(int p,int r,int t) {
		int amount=p+(p*r*t)/100;
		return amount;
	}
	public static void main(String[] args) {
		int p=100;
		int r=10;
		int t=2;
		System.out.println(calculateSI(p,r,t));
		

	}

}
