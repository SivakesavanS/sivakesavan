package mAArray;

public class Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t=1;
int a[]= {1,-2,-2,3,0,0,5,4};
int b[]=new int [a.length];
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			t++;
			b[j]=-1;
			
		}
	}
	if(b[i]!=-1) {
		b[i]=t;
	}
	t=1;
}
for(int i=0;i<a.length;i++) {
	if(b[i]>0) {
		System.out.println(a[i]+" "+b[i]);
	}
}
	}

}
