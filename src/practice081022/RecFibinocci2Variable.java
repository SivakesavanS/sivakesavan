package practice081022;

public class RecFibinocci2Variable {
 void Fibino(int f,int s,int k) {
	 System.out.println(f+s);
	 f=f+s;
	 s=f-s;
	 k++;
	 if (k<=6){
		 Fibino(f,s,k);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFibinocci2Variable s=new RecFibinocci2Variable();
  		s.Fibino (1,-1,1);
	}

}
