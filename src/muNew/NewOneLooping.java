package muNew;

public class NewOneLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=100;
     int b=120;
     int count=0;
     int div=2;
     int small=(a<b?a:b);
     
     while(div<small) {
    	 if(a%div==0&&b%div==0) {
    		 count++;
    	 }
    	 div++;
     }
     System.out.println(count);
	}

}
