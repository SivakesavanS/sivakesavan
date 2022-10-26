package assignmentString;

public class Q4 {
	void count(String a) {
		char b='a';
		int count=0;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c==b) {
				
				count++;
				}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="sivakesavan";	
Q4 s1=new Q4();
s1.count (s);
	}

}
