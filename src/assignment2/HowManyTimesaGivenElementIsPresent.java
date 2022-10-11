package assignment2;

public class HowManyTimesaGivenElementIsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {1,2,3,3,4,5,5};
   int j=3;
   
   int count=0;
   for (int s:a) {
	   if(j==s) {
		   count++;
	   }
	   
   }
  
   System.out.println(j+"="+count);
	}

}
