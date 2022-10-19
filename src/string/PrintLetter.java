package string;

public class PrintLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="chennai65545";
boolean flag=false;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c>='0'&&c<='9') {
flag=true;
	}
//	else {
//		System.out.println("number no");	
//	}	
	
}
if(flag==true) {
	System.out.println("number yes");
	
}
else {
	System.out.println("number no");	
}	

	}

}
