package practice081022;

public class RecFibinocci {
int f=-1;
int s=1;
int t;
int k=1;
void fibinocci() {
	t=f+s;
	System.out.println(t);
	f=s;
	s=t;
	k++;
	if(k<=6) {
		fibinocci();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecFibinocci s=new RecFibinocci();
		s.fibinocci();
	}

}
