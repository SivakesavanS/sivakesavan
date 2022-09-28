package practice150922;

public class SumOfSingleValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long i=999999777;
long sum=0,b;
while(i>0) {
	long r=i%10;
	sum=sum+r;
	i=i/10;
}
   if(sum>10) {
		b=sum%10;
	  
	    sum=sum/10;
	    sum=sum+b;
}
	if(sum>10) {
		long c=sum%10;
		sum=sum/10;
		sum=sum+c;
		
	}
	System.out.print(sum);
}
}
