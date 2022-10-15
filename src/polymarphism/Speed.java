package polymarphism;

public class Speed extends Basic{
	int a=5;
void count() {
	
	System.out.println(a);
	a--;
	if(a>0) {
		count();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speed s=new Speed();
		s.count();
		s.pattern();
		Basic s1=new Basic();
	s1.count();
		s1.pattern();
	}

}
