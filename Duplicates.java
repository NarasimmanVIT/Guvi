package practice;

public class Duplicates{
	private void findDuplicate() {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,3,4,5,4,6,6};
		
		for(int i=0;i<arr.length;i++) {
			outerloop:
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]);
					break outerloop;
				}
			}
		}
		
	}
public static void main(String args[]) {
	Duplicates obj=new Duplicates();
	obj.findDuplicate();
}


}
