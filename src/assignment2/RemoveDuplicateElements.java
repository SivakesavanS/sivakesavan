package assignment2;

public class RemoveDuplicateElements {
  void Dublicate(int a[]) {
	  int t=1;
	  int b[]=new int [a.length];
	  for(int i=0;i<a.length;i++) {
		  
		  for(int j=i+1;j<a.length;j++) {
			 if( a[i]==a[j]) {
				 t++;
				 b[j]=-1;
			 }  
		  }	  
		  if(b[i]!=-1) {
			  b[i]=t;			  
		  } t=1;			  
//		  b[i]=a[i];
//	  }
//	  for(int i=0;i<a.length;i++) {
//		  for(int j=0+i;i<a.length;j++) {
//			  if(a[i]==a[j]) {
//				  b[i]=0;
//			  }
//		  }
	  }
	  for(int i=0;i<a.length;i++) {
		  if(b[i]>=1) {
			  System.out.println(a[i]);
		 }
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int k[]= {-1,2,2,4,4,5,3,7,8,0,5,5,1};
   RemoveDuplicateElements s=new RemoveDuplicateElements();
   s.Dublicate(k);
	}

}
