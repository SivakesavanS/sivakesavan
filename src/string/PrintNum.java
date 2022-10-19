package string;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="sivakesavan";
boolean flag=false;
for(int i=0;i<name.length();i++) {
	char c=name.charAt(i);
	if(c>='0'&&c<='9') {//'s'>='0'--234>=48&&234<=56
		flag=true;
		break;
	}
}
//System.out.println(flag);
if(flag) {
	System.out.println("Number yes");
}
else {
	System.out.println("Number No");
}
	}

}
