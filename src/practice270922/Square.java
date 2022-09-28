package practice270922;

public class Square {
	 int a,b;
	 void area() {
		 System.out.println(a*b);
		 System.out.println(a-b);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=new Square();
		Square s2=new Square();
		s1.a=5;
		s1.b=6;
		s2.a=2;
		s2.b=4;
		s2.area();
		s1.area();
		s1.area();
		s1.area();
		System.out.println("heelo");
		s1.area();
	}

}
