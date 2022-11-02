package muthu;

public class InstanceBlock {
	InstanceBlock(){
		System.out.println("hi constractor");
	}
	{
		System.out.println("hi instance block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock s=new InstanceBlock();
	}

}
