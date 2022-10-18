 package company;

public class Employee {
	int emid=12;
	public String name="siva";
	protected String mobile="277635";
	private String pass="1234";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s=new Employee();
		System.out.println(s.emid);
		System.out.println(s.name);
		System.out.println(s.mobile);
		System.out.println(s.pass);
	}

}
