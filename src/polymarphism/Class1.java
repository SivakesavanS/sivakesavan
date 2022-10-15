package polymarphism;

public class Class1 {
	void max(String name) {
		System.out.println("String = " + name);
	}
	void max(int a) {
		System.out.println("int = " + a);
	}
	void max(float a) {
		System.out.println("float = " + a);
	}
	void max(byte a) {
		System.out.println("byte = " + a);
	}
	void max(char a) {
		System.out.println("char = " + a);
	}
	void max(double a) {
		System.out.println("double = "  + a);
	}
	void max(boolean a) {
		System.out.println("boolean = " + a);
	}
	void max(short a) {
		System.out.println("short = " + a);
	}
	void max(long a) {
		System.out.println("long = " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 s=new Class1();
		s.max("sivakesavan");
		s.max(234);
		s.max(3.1f);
		byte a=5;
		s.max(a);
		s.max('a');
		s.max(5.2334D);
		s.max(4>6);
		short b=6;
		s.max(b);
		s.max(837365333L);
	}

}
