package day5;

import java.util.*;
 
public class Demo6 {
	public static void main(String[] args) {
		// list
//		ArrayList al = new ArrayList(); // best to serach operation
//		LinkedList al = new LinkedList(); // best for insert and delete
//		Vector al = new Vector();
//		Stack al = new Stack();
		TreeSet al = new TreeSet();
		al.add(100);
		al.add(345);
		al.add(234);
		al.add(5656);
//		al.add("Abc");
		al.add(76);
		Iterator i =	al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//		Collections.sort(al);
//		System.out.println(al);
//		Collections.reverse(al);
//		System.out.println(al);
//		
//		Set s= new Set();
//		HashSet al = new HashSet();// no dup + no order
//		LinkedHashSet al = new LinkedHashSet(); // no dup + user entered order
//		TreeSet al = new TreeSet(); //no dup + sorted order
 
		HashMap map = new HashMap();// no dup + randorm order
//		LinkedHashMap map = new LinkedHashMap();
		//TreeMap map = new TreeMap();  // home genius
		map.put(111, "Abi");	
		map.put(456, "Harsih");
		map.put(453, "Manish");
		map.put(789, "Ganesh");
		map.put(111, "Thanesh");
		map.put("ABC", "ISHA");
		map.put("XYZ", "ISHA");
		map.put("ATOZ", "ISHA");
		map.put("AAA", "ISHA");
		map.put("BBB", "ISHA");
		Set s = map.entrySet();
		Iterator i1 =	s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}		
}