package practice081022;

public class Recurssion {
int n=1;
int b=1;

void m1() {
	System.out.println(b);
	//n*=2;
	n++;
	b=b*n;
	
	if(n<=5) 
		
		m1();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurssion s=new Recurssion();
		s.m1();
	}

}
