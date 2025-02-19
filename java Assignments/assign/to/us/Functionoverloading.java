package assign.to.us;

public class Functionoverloading {
	int area(int d1,int d2) {
		return (d1*d2)/2;
	}
	int area(int r) {
		return (int)3.14*r*r;
	}
	float area(float a,float b) {
		return a*b;
	}
	long area(long a,long b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Functionoverloading f=new Functionoverloading();
		System.out.println(f.area(2,3));
		System.out.println(f.area(8));
		System.out.println(f.area(8.2f,5.9f));
		System.out.println(f.area(3L,4L));
	}

}
