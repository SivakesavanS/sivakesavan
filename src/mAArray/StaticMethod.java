package mAArray;

public class StaticMethod {
	static int a =10;
	int b=5;
static void cal() {
//	int a=10;
//	int b=5;
	int  m=2;
	
	//int c=a+b+m;
	int c=a+m;
	System.out.println("This is a Static Method "+c);
}
void add() {
      cal();
//	int d=a+b;
	int b=6;
	//System.out.println(m);
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod s=new StaticMethod();
	//cal();
		s.add();
	}

}
