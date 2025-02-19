package assign.to.us;

public class Calculator {
	int solve(int a,int b) {
		return a+b;
	}
	double solve(double a , double b) {
		if(b==0)System.out.println("error of division");
		return a/b;
	}
	float solve(float a,float b) {
		return a-b;
	}
	long solve(long a,long b) {
		return a*b;
	}
	boolean even(int a) {
		return a%2==0?true:false;
	}
	boolean prime(int a) {
		for(int i=2;i*i<=a;i++) {
			if(a%i==0)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.solve(3,4));
		System.out.println(c.solve(3.4,1.6));
		System.out.println(c.solve(3.5f,8.6f));
		System.out.println(c.solve(045344543L,5353343L));
		System.out.println(c.even(5));
		System.out.println(c.even(4));
		System.out.println(c.prime(5));
		System.out.println(c.prime(59893));
		
	}

}
