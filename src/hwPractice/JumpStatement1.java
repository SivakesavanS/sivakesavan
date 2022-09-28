package hwPractice;

public class JumpStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outerloop:
	for(int i=1;i<=5;i++) 
	{
		innerloop:
			for(int j=1;j<=5;j++) 
			{
			if(i==3 && j==3)
				break Outerloop;
				System.out.print("*");	
			}
		System.out.print("\n");		
	}
	}

}
