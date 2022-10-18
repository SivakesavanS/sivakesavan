package abstraction;

public class Person implements Family,Company {
	public void takecare() {
		System.out.println("hi");
	}
	public void attendfunction() {
		System.out.println("siva");
	}
	public void attendance() {
		System.out.println("siva1");
	}
	public void dresscode() {
		System.out.println("siva2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Family siva=new Person();
siva.takecare();
siva.attendfunction();
Company siva1=new Person();
siva1.attendance();
siva1.dresscode();
Person siva2=new Person();
siva2.takecare();
siva2.attendfunction();
siva2.attendance();
siva2.dresscode();

	}

}
