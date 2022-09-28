package parctice070922;

public class FindLagerceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20,b=20,c=20;
    
if(a>b&&a>c)
    {
    	System.out.println(a);
    }

    else if(b>c)
    {
		System.out.println(b);
    }
    
    else if(c>a&&c>b) 
    {
		System.out.println(c);
    }
    if(a==b&&b==c){
    	System.out.println("Equel");
    }
    else if (a!=b&&b!=c){
    	System.out.println("Not Equel");
    }
    
	}

}
