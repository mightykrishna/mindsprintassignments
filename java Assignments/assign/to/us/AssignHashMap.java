package assign.to.us;
import java.util.*;
public class AssignHashMap {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(0, "India");
		linkedHashMap.put(1, "Bangladesh");
		linkedHashMap.put(2, "Nepal");
		linkedHashMap.put(3,"China");
		linkedHashMap.put(4,"USA");
		linkedHashMap.put(5,"Brazil");
		linkedHashMap.put(6,"SriLanka");
		linkedHashMap.put(7,"WI");
		linkedHashMap.put(8,"Bhutan");
		linkedHashMap.put(9,"France");
		linkedHashMap.put(10,"Germany");
		for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
		System.out.println(linkedHashMap.containsValue("India"));
		System.out.println(linkedHashMap.containsKey(45));
		linkedHashMap.remove(4);
		for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
		Map<Integer,String> ss=new LinkedHashMap();
		ss.put(11, "Bihar");
		ss.put(12, "TamilNadu");
		linkedHashMap.putAll(ss);
		System.out.println(linkedHashMap);
		linkedHashMap.remove(5);
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.isEmpty());
		linkedHashMap.clear();
		
	}

}
