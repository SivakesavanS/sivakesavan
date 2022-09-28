package parctice070922;

public class ThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=9,b=9,c=3;
if(a==b&&b==c) {
	System.out.print("all are equal");
}else {
if(a==b) {
	System.out.println("A Equel B");
	if(a>c) {
		System.out.print("and big");
	}else if(c>b) {
		System.out.println("c and is greater");
		}
}
if(b==c) {
	System.out.println("B Equel C");
	if(b>a) {
		System.out.println(": and is greater");
		}
	else if(a>b) {
		System.out.println("A and is greater");
		}
}
if(c==a) {
	System.out.println("C Equel A");
	if(c>b)
	{
		System.out.println(" :C and A is greater");
	}else if(b>a) {
		System.out.println("B and is greater");
		}
}}
}}