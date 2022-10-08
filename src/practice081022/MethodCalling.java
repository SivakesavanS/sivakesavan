package practice081022;

public class MethodCalling {
int n=1;
void m1() {
	System.out.println(n);
	n++;
	if(n<=10)
	m1();
	
}
//void m2() {
//	System.out.println(n);
//	n++;
//	m3();
//}
//void m3() {
//	System.out.println(n);
//	n++;
//	m4();
//}
//void m4() {
//	System.out.println(n);
//	n++;
//	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling s=new MethodCalling();
		s.m1();
	}

}
