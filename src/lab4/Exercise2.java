package lab4;

import java.io.*;
public class Exercise2 {

	int [][]arr;
	int []new_array;
	
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
		
		
		
	}
	
}
