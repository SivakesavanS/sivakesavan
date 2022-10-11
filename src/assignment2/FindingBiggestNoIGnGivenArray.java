package assignment2;

public class FindingBiggestNoIGnGivenArray {
int big(int a[]) {
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,9,3,4,5,6};
		FindingBiggestNoIGnGivenArray s=new FindingBiggestNoIGnGivenArray();
		int x=s.big(k);
		System.out.println(x);
	}

}
