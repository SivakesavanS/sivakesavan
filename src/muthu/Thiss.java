package muthu;

public class Thiss {
	void  thisq() {
		System.out.println("hi");
	}
	void thisw() {
		this.thisq();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thiss s=new Thiss();

s.thisw();
	}

}
