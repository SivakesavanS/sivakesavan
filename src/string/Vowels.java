package string;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="SIVA kesavan";
String k=s.toUpperCase();
String y=s.toLowerCase();

//System.out.println(s);
//System.out.println(k);
//System.out.println(y);

for(int i=0;i<s.length();i++) {
	char c=y.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		System.out.println(c);
		 
	}
}
//char a=		s.charAt(2);
//System.out.println(a);
}

}
