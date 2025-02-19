package assign.to.us;
import java.util.*;
public class LinkedAssign {
	
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");
        System.out.println(ll); 
        ll.addLast("December");
        ll.addFirst("Januray");
        System.out.println(ll); 
        ll.add(1, "March");
        System.out.println(ll); 
        ll.add(1,"February");
        System.out.println(ll); 
        ll.add(8,"September");
        System.out.println(ll); 
        ll.add(9,"October");
        System.out.println(ll); 
        ll.remove("April");
        ll.add(3, "April");
        System.out.println(ll);
        Iterator itr1=ll.iterator();
        int a=0;
        System.out.println("even months");
       for(int i=0;i<ll.size();i+=2) {
    	   System.out.println(ll.get(i));
       }
        System.out.println("odd months");
        for(int i=1;i<ll.size();i+=2) {
     	   System.out.println(ll.get(i));
        }
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
        System.out.println(ll.getFirst()+ll.getLast());
        System.out.println(ll.remove("August"));
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll);
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);
        
        
	}

}
