package practice;

import java.util.Scanner;

public class Duplicates{
	private void findDuplicate() {
		// TODO Auto-generated method stub
			int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
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
