package lab4;

import java.util.*;
public class Arr_exercise1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String []args) {
		
		System.out.println("Enter the length of the original array");
		int len=sc.nextInt();
		System.out.println("Enter the elements of the array in order");
		int arr[]=new int[len];
		for(int i=0;i<len;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the length of the cloned array");
		int l=sc.nextInt();
		System.out.println("Enter the start value");
		int start=sc.nextInt();
		if(start==0)
			clone(arr, l);
		clone(arr, l, start);
	}
	static void clone(int arr[], int l) {
		
		int a[]=new int[l];
		for(int i=0;i<a.length;i++) {
			a[i]=arr[i];
		}
		display(a);
	}
static void clone(int arr[], int l, int start) {
		
		int a[]=new int[l];
		for(int i=start;i<a.length;i++) {
			a[i]=arr[i];
		}
		display(a);
	}
	static void display(int a[]) {
		for(int i : a) {
			System.out.print(a[i]+"\t");
		}
	}
}
