package practice081022;

public class RecLocalVariable1 {
int n=2;
void m1() {
	System.out.println(n);
	n++;
	if(n<=5) {
		m1();
	}
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecLocalVariable1 s=new RecLocalVariable1();
	  s.m1();	
	}

}
