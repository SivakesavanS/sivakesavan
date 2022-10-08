package practice081022;

public class RecInstantVariable {
void m1(int a) {
	System.out.println(a);
	a++;
	if(a<=5) {
		m1(a);
	}
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecInstantVariable s=new RecInstantVariable();
		s.m1(1);
	}

}
