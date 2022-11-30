package muCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist1 s=new Linkedlist1();
		//s.linked_list();
		//s.learn_Hashset();
		//s.learn_LinkedHashset();
		//s.learn_TreeSet();
		s.logic_program2();
	}

	private void logic_program2() {
		// TODO Auto-generated method stub
		ArrayList marks = new ArrayList(); 
		// marks.add(10); 
		 //marks.add("manikandan");
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Press 'y' to continue");
		 String input = sc.next();
		 int total=0;
		 while(input.equals("y"))
		 {
		  System.out.println("Enter Mark");
		  int mark = sc.nextInt(); 
		  marks.add(mark); 
		  System.out.println("Press 'y' to continue");
		  input = sc.next(); 
		 // total=total+mark;
		  
		 }
		 Integer y=0;
		// System.out.println(marks);
		 for(Object mark:marks) {
			 Integer i=(Integer)mark;
			 Object s=i;
			 y=y+i;
			
			System.out.println(" Entered num "+s);
		 }
		 System.out.println("Entered num total a+b = "+y);
	}

	private void learn_TreeSet() {
		// TODO Auto-generated method stub
		TreeSet al = new TreeSet(); 
//		 al.add(10); 
//		 al.add(5.5f);
//		 al.add(true); 
//		 al.add(1234);
//		 al.add(10.3); 
//		 al.add(1234); 
//		 al.add('c'); 
		 al.add("siva");
		 al.add("paul");
		 al.add("arun");
		 al.add("John");
		 
		// Mobiles m1 = new Mobiles("vivo"); 
//		 CollectionDemo cd = new CollectionDemo(); 
//		 al.add(cd);
	//	 al.add(m1);
		 //al.add(al);
		 System.out.println(al);
//		 TreeSet al2 = new TreeSet(); 
//		 System.out.println(al2);
//		 al2.add("idli"); 
//		 al2.add("dosai");
//		 //al2.add(1,"pongal"); 
//		 //al2.remove("idli"); 
//		 System.out.println(al2);
//		 System.out.println(al2.remove(1));
//		 System.out.println(al2);
//		 //al2.remove("pongal"); 
//		 System.out.println(al2);
//		 //al2.remove(0);
//		 //al2.addAll(1,al); 
//		 System.out.println(al2);
//		 //System.out.println(al2.get(0)); 
//		 System.out.println(al2);
//		 //al2.clear();
//		 //al2.removeAll(al); 
//		 //al2.retainAll(al);
//		 System.out.println(al2);
//		 System.out.println(al2.contains("idli")); 
		 
		 //Object[] o = al2.toArray(); 
		 //List al3 = al2.subList(3, 5); 
		 //System.out.println(al3);
		
		
	}

	private void learn_LinkedHashset() {
		// TODO Auto-generated method stub
		
				LinkedHashSet al = new LinkedHashSet(); 
				 al.add(10); 
				 al.add(5.5f);
				 al.add(true); 
				 al.add(1234);
				 al.add(10.3); 
				 al.add(1234); 
				 al.add('c'); 
				 al.add("Siva");
				// Mobiles m1 = new Mobiles("vivo"); 
				 CollectionDemo cd = new CollectionDemo(); 
				 al.add(cd);
				// al.add(m1);
				 //al.add(al);
				 System.out.println(al);
				 LinkedHashSet al2 = new LinkedHashSet(); 
				 System.out.println(al2);
				 al2.add("idli"); 
				 al2.add("dosai");
				 //al2.add(1,"pongal"); 
				 //al2.remove("idli"); 
				 System.out.println(al2);
				 System.out.println(al2.remove(1));
				 System.out.println(al2);
				 //al2.remove("pongal"); 
				 System.out.println(al2);
				 //al2.remove(0);
				 //al2.addAll(1,al); 
				 System.out.println(al2);
				 //System.out.println(al2.get(0)); 
				 System.out.println(al2);
				 //al2.clear();
				 //al2.removeAll(al); 
				 //al2.retainAll(al);
				 System.out.println(al2);
				 System.out.println(al2.contains("idli")); 
				 
				 //Object[] o = al2.toArray(); 
				 //List al3 = al2.subList(3, 5); 
				 //System.out.println(al3);
	}

	private void learn_Hashset() {
		// TODO Auto-generated method stub
			
				HashSet al = new HashSet(); 
				 al.add(10); 
				 al.add(5.5f);
				 al.add(true); 
				 al.add(1234);
				 al.add(10.3); 
				 al.add(1234);
				 al.add('c'); 
				 al.add("Siva");
				// Mobiles m1 = new Mobiles("vivo"); 
				 CollectionDemo cd = new CollectionDemo(); 
				 al.add(cd);
				// al.add(m1);
				 //al.add(al);
				 System.out.println(al);
				 HashSet al2 = new HashSet(); 
				 System.out.println(al2);
				 al2.add("idli"); 
				 al2.add("dosai");
				 //al2.add(1,"pongal"); 
				 //al2.remove("idli"); 
				 System.out.println(al2);
				 System.out.println(al2.remove(1));
				 System.out.println(al2);
				 //al2.remove("pongal"); 
				 System.out.println(al2);
				 //al2.remove(0);
				 //al2.addAll(1,al); 
				 System.out.println(al2);
				 //System.out.println(al2.get(0)); 
				 System.out.println(al2);
				 //al2.clear();
				 //al2.removeAll(al); 
				 //al2.retainAll(al);
				 System.out.println(al2);
				 System.out.println(al2.contains("idli")); 
				 
				// Object[] o = al2.toArray(); 
				 //List al3 = al2.subList(3, 5); 
				 //System.out.println(al3);

			
	}

	private void linked_list() {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList(); 
		 al.add(10); 
		 al.add(5.5f);
		 al.add(true); 
		 al.add(1234);
		 al.add(10.3); 
		 al.add('c'); 
		 al.add("Siva");
		// Mobiles m1 = new Mobiles("vivo"); 
		 CollectionDemo cd = new CollectionDemo(); 
		 al.add(cd);
		// al.add(m1);
		 //al.add(al);
		 System.out.println(al);
		 LinkedList al2 = new LinkedList(); 
		 System.out.println(al2);
		 al2.add("idli"); 
		 al2.add("dosai");
		 //al2.add(1,"pongal"); 
		 //al2.remove("idli"); 
		 System.out.println(al2);
		 System.out.println(al2.remove(1));
		 System.out.println(al2);
		 //al2.remove("pongal"); 
		 System.out.println(al2);
		 //al2.remove(0);
		 //al2.addAll(1,al); 
		 System.out.println(al2);
		 System.out.println(al2.get(0)); 
		 System.out.println(al2);
		 //al2.clear();
		 //al2.removeAll(al); 
		 //al2.retainAll(al);
		 System.out.println(al2);
		 System.out.println(al2.contains("idli")); 
		 
		 Object[] o = al2.toArray(); 
		 List al3 = al2.subList(3, 5); 
		 System.out.println(al3);
		 
		 
	}

}
