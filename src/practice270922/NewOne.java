package practice270922;

public class NewOne {
	int a,b;
	void square() {
		System.out.println(a*a);	
	}
	void cube() {
		System.out.println(a*a*a);	
	}void cube1() {
		System.out.println(b*b*b);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NewOne paul=new NewOne();
     //NewOne siva=new NewOne();
    paul. a=5;
    paul. b=6;
   // siva.a=6;
     paul.cube();
     paul.cube1();
    // siva.cube();
     
	}

}
