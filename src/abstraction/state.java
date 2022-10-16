package abstraction;

public class state {
	String name;
	int a;
// static String flag ="ashoka chakra";
// static String  country ="india";
 
 static void display() {
	 String flag ="ashoka chakra";
	String  country ="india";
	 System.out.println(flag);
	 System.out.println(country);
	
 }
 void print() {
	 System.out.println(name);
	 System.out.println(a);
 }
 void max() {
	 System.out.println(name);
	 System.out.println(a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		state tn=new state();
		tn.name="tamil nadu";
		tn.a=19;
		display();
		tn.print();
		
		state ka=new state();
		ka.name="karnadaka";
		ka.a=20;
		display();
		ka.max();

		
	
		
	}

}
