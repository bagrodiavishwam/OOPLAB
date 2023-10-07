package lab4;

import java.util.*;
public class Arr_exercise1 {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the original array");
		int len=sc.nextInt();
		System.out.println("Enter the elements of the array in order");
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
	}

}
