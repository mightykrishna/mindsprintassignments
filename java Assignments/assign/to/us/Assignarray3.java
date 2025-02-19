package assign.to.us;
import java.util.*;
public class Assignarray3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("watermelon");
		al.add("papaya");
		al.add("orange");
		al.add("kiwi");
		System.out.println(al);
		al.add("Chennai");
		al.add("Patna");
		System.out.println(al);
		al.add("cooking");
		al.add("drawing");
		System.out.println(al);
		
		al.remove("cooking");
		System.out.println(al);
		System.out.println(al.contains("cricket"));
		al.remove("Chennai");
		al.remove("apple");
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.get(6));
		al.set(6,"Dancing");
		System.out.println(al);
		al.add(4,"kerela");
		System.out.println(al);
		al.add(2,"Mango");
		System.out.println(al);
		System.out.println(al.subList(2, 5));
		
	}

}
