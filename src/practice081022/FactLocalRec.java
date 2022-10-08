package practice081022;

public class FactLocalRec {
int Fact(int a) {
	if(a>1) {
		int f = Fact(a-1);
		return a*f ;
		// return a* Fact(a-1);
	}
	else
	return 1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactLocalRec s=new FactLocalRec();
		int res = s.Fact(5);
		System.out.println(res);
	}

}
