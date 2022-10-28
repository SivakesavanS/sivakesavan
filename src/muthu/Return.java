package muthu;

public class Return {
	int siva() {
		int b=siva1()+5;
		return b;
		//System.out.println(b);
		
		//siva1();
	}
 int siva1() {
	int a=10;
	return a;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return s=new Return();
		s.siva();
	int c=	s.siva1();
	int d=s.siva();
	System.out.println(d);
	System.out.println(c);
//		int n=2%4;
//		System.out.println(n);
	}

}
