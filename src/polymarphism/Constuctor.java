package polymarphism;

public class Constuctor {
	int rollno;
	String name;
	Constuctor(){
		rollno=123;
		name="siva";
		
	}Constuctor(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
//		System.out.println(rollno);
//		System.out.println(name);
	}void max(){
		System.out.println(rollno);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctor s=new Constuctor(10,"sasjnv");
		Constuctor s1=new Constuctor();
		s1.rollno=124;
		s1.name="kesavan";
		s.max();
		s1.max();
		
	}

}
