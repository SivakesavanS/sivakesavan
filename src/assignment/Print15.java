package assignment;

public class Print15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=20,f=0;
	    	for(int i=1;i<=n;i++)
	    	{
	    		for(int j=1;j<=n;j++)
	    	{
	    		if(i%j==0){
	    			f=f+1;
	           }
	    		
	    		}if(f==2)
	    		{
	    			System.out.println(i);
	    		}f=0;
	    	
	    	   }
	}
}
