package practice280922;

public class Maths {
int a,b;
void add()
{
	System.out.println(a+b);
}
void sub()
{
	System.out.println(a-b);
}
void mul()
{
	System.out.println(a*b);
}
void dev()
{
	System.out.println(a/b);
}
void rem()
{
	System.out.println(a%b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Maths m1 =new Maths();
      Maths m2 =new Maths();
      m2.a=10;
      m2.b=20;
      m1.a=10;
      m1.b=5;
      m1.add();
      m1.sub();
      m1.mul();
      m1.dev();
      m1.rem();
      m2.add();
      m2.sub();
      m2.mul();
      m2.dev();
      m2.rem();
	}

}
