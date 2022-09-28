package practice280922;

public class Fact {
   int n,b;
   void siva() {
	while(n>0) {
		 b=b*n;
	  n--;}
	   System.out.print(b);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Fact s = new Fact();
      s.n=5;
      s.b=1;
      s.siva();
	}

}
