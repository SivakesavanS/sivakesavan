package practice160922;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=20,i=0;
   int b[]=new int[10];
   while(a>0) {
	   b[i]=a%2;
	   System.out.println(b[i]);
	   a=a/2;
	   i++;
   }
   System.out.println("After");
   for(int j=9;j>0;j--) {
	   System.out.println(b[j]);
   }
	}

}
