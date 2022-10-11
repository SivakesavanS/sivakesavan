package assignment2;

public class MoveRight {
void move(int a[]) {
	int b=a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
	//	System.out.print(a[i]);
	}
	a[0]=b;
	for(int j=0;j<a.length;j++) {
		 System.out.print	(a[j]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5};
		MoveRight s=new MoveRight();
		s.move(k);
	}

}
