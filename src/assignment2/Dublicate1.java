package assignment2;

public class Dublicate1 {
	void remove(int a[]) {
		int b[]=new int [a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				b[j]=-1;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(b[i]>-1) {
				System.out.println(b[i]);
			}
		}
	}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,2,3,4,0,4,5,3,0,6};
		Dublicate1 s=new Dublicate1();
		s.remove(k);
	}

}
