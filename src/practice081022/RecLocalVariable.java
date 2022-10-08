package practice081022;

public class RecLocalVariable {
void m1(int a) {
	System.out.println(a);
	a++;
	if(a<=5) {
		m1(a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecLocalVariable s=new RecLocalVariable();
		s.m1(1);
	}

}
