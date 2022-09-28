package class120922;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=20;i++) 
    /*{
	if(i%3!=0&&i%5!=0) {
		System.out.println(i);
	}
	*/
	if(i%3==0&&i%5==0) {
		System.out.println("BigBang");
		//continue;
	}
	else if(i%3==0) {
		System.out.println("Big");
	}
	else if(i%5==0) {
		System.out.println("Bang");
	}	
	else {
		System.out.println(i);
}
	}

}
