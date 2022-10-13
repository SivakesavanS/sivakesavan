package staticS;

public class Static {
 String  name;
static String country="india";

void siva() {
System.out.println(name);	
}
void paul() {
	System.out.println(country);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static tn=new Static();
	tn.name="Tamil Nadu";
	tn.siva();
	tn.paul();			
	Static kr=new Static();
	kr.name="Kerala";
	kr.siva();
	kr.paul();
//		System.out.println(country);
//		System.out.println(name+name);
	
	
	}
}
