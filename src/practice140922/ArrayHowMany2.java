package practice140922;

public class ArrayHowMany2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {5,2,2,2,2,2};
      int b=0;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]==2) {
    		   b=b+1;   	       	   
       }
	}System.out.print(b);

}
}