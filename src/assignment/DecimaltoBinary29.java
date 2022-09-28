package assignment;

public class DecimaltoBinary29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20,i=0;
    int b[]=new int [10];//method 1
    //int a[]={1,2,3,4,5} method 2
    while(a>0) {
    	b[i]=a%2;
    	System.out.print(b[i]);
    	a=a/2;
    	i++;
    	
    }
//    System.out.println();
//    for(int j=9;j>0;j--) {
//    	System.out.print(b[j]);
//    }
//    
    
	}

}
