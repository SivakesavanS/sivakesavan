package abstraction;

public class Diam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
for(int i=0;i<=n;i++) {
	for(int j=0;j<=n;j++) {
		//System.out.print(j);
		int b=i>n/2?i:n-i;
		if(b<=j) {
			System.out.print("* ");
		}else if(j>=4){
			System.out.print(" ");	
		}
			
	}
	System.out.println();
}
	}

}
