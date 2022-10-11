package assignment2;

public class CopyAddIndexnewArray {
void Addindex(int a[]) {
	int b[]=new int [a.length];
	for(int i=1;i<a.length;i+=2) {
//		if(i%2!=0) {
				b[i]=a[i];
				System.out.println(i+" = "+b[i]);
				
//		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int k[]= {1,1,3,4,5,6,7,8,9};
   CopyAddIndexnewArray s= new CopyAddIndexnewArray();
   s.Addindex(k);
	}

}
