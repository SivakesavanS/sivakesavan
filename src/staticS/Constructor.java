package staticS;

public class Constructor {
	int a;
	String name;
	Constructor(int a,String name){
		this.a=a;
		this.name=name;
	}
	void siva() {
		System.out.println(a);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor s= new Constructor(5,"siva");
		s.siva();
	}

}
