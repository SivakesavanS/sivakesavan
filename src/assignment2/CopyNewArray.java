package assignment2;

public class CopyNewArray {
	  void Copy(int a[]) {
		  int b[]=new int [a.length];
		  for(int i=a.length-1;i>=0;i--) {
			  	b[i]=a[i];
			  	System.out.println(b[i]);
		  }
		  
	  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int k[]= {1,2,3,4,5};
			CopyNewArray s=new CopyNewArray();
			s.Copy(k);
			
			
		}

}
