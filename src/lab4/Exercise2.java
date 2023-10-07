package lab4;

import java.io.*;
public class Exercise2 {

	static int [][]arr;
	static int []new_array;
	
	void newArray() {
		int sum=0;
		int t=0;
		
		for(int i = 0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum+=arr[j][i];
			}
			new_array[t]=sum;
			++t;
		}
	}
	
	public static void main(String args[])throws IOException {
		
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter the number of rows in 2D Array: ");
		int r=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number of columns in 2D Array: ");
		int c=Integer.parseInt(br.readLine());
		
		arr=new int[r][c];
		new_array=new int[r];
		
		System.out.println("Enter the 2D array");
		
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
		
		
		
	}
	
}
