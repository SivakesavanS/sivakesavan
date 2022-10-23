package question;

public class Q1 {
	void Dublicate(int a[]) {
		int b[]=new int [a.length];
		int t=1;
		for(int i=0;i<a.length;i++) {
			//b[i]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					//b[i]=0;
					t++;
					
					b[j]=-1;
				}
			}
			if(b[i]!=-1) {
				b[i]=t;
			} t=1;
			
		}
		for(int i=0;i<a.length;i++) {
			if(b[i]>1) {
System.out.println(a[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k[]= {0,1,2,2,2,3,4,-6,0,5,5,5,-6};
Q1 s=	new Q1();
s.Dublicate(k);
	}

}
