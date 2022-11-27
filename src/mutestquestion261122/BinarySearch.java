package mutestquestion261122;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch s=new BinarySearch();
		s.binary_search();

	}

	private void binary_search() {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int key=11;
		int min=0;
		int max=a.length-1;
		while(min<=max) {
			int mid=(min+max)/2;
		//	int mid=max/2;
			if(key==a[mid]) {
			System.out.println("Position Is "+mid +" key Value is "+ a[mid]);
			break;
			}
			else if(key<a[mid]) {
				max=mid-1;
			}
			else {
				min=mid+1;
			}
			if(min>max) {
				System.out.println("Given Number Is Not Present");
			}
		}
	}

}
