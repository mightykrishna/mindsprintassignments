package assign.to.us;
import java.util.TreeSet;
public class Assigntree {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add("cpp");
		ts.add("java");
		ts.add("python");
		ts.add("Ruby");
		ts.add("c#");
		ts.add("c");
		System.out.println(ts);
		ts.remove("cpp");
		System.out.println(ts);
		ts.remove("c");
		System.out.println(ts);
		ts.add("Kotlin");
		System.out.println(ts);
		ts.add("rust");
		System.out.println(ts);
		ts.add("sanskrit");
		System.out.println(ts);
		ts.clear();
		System.out.println(ts);
		
	}

}
