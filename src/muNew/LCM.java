package muNew;

public class LCM {
void lcm(int a,int b) {
	int big=a>b?a:b;
	while(true) {
		if(big%a==0&&big%b==0) {
			System.out.println(big);
			break;
		}
		big++;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LCM s=new LCM();
s.lcm(5,16);
	}

}
