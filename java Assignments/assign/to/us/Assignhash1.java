package assign.to.us;
import java.util.LinkedHashSet;
public class Assignhash1 {
	
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(1);
		lhs.add(2);
		lhs.add(9f);
		lhs.add(15f);
		lhs.add('s');
		lhs.add('a');
		lhs.add(true);
		//operations
		lhs.add(500);
		lhs.add("saurabh");
		lhs.remove('s');
		System.out.print(lhs);
		System.out.println(lhs.contains("saurabh"));
		System.out.println(lhs);
		if(lhs.contains("5") || lhs.contains(5) || lhs.contains('5')) {
			System.out.println("True");
		}
		else System.out.println("False");
		lhs.clear();
		System.out.println(lhs);
		
		LinkedHashSet ls=new LinkedHashSet();
		for(int i=0;i<10;i++) {
			ls.add(i);
		}
		ls.add(500);
		ls.add("saurabh");
		ls.remove('s');
		System.out.println(ls.contains("saurabh"));
		System.out.println(ls);
		if(ls.contains("5") || ls.contains(5) || ls.contains('5')) {
			System.out.println("True");
		}
		else System.out.println("False");
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
		
		
		
	}

}
