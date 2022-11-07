package muNew;

public class Power {
	void power(int a) {
		int result=1;
		int num=1;
		while(a>=1) {
			result=result*num;
			a--;
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power s=new Power();
		s.power(10);
	}

}
