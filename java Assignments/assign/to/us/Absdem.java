package assign.to.us;
abstract class MNC{
	MNC(){
		System.out.print("MNC is created");
	}
	abstract void leave();
	abstract void holidays();
	void display() {
		System.out.print("hello");
	}
	
}
abstract class Mindsprint extends MNC{
	Mindsprint(){
		System.out.print("Mindsprint is created");
	}
	abstract void leave();
	void holidays() {
		System.out.println("Holiday");
	}
	void display() {
		System.out.print("hello");
	}
	
}

class Hello extends Mindsprint{
	void leave() {
		System.out.println("leave");
	}
	void holidays() {
		System.out.println("Holiday");
	}
	void display() {
		System.out.print("hello");
	}
	
}
public class Absdem {

	public static void main(String[] args) {
		MNC m=new Hello();
		m.display();
		m.holidays();
		m.leave();
		
	}

}
