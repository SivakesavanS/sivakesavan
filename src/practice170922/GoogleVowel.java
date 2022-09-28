package practice170922;

public class GoogleVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* char ch = 's';

	 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
   System.out.println(ch + " is vowel");
else
 System.out.println(ch + " is consonant");
 */
		char ch = 'e';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
	}

}
