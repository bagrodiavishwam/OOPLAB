package lab2;

import java.io.*;
public class Q1_printsum {
	public static void main(String [] args)throws IOException{
		// InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []a=new int[10];
		int sum=0;
		for(int i=0;i<10;i++){
		System.out.println("Enter value number: "+(i+1));
		a[i]=Integer.parseInt(br.readLine());
		sum+=a[i];
		}
		System.out.println("The sum is: "+sum);
		br.close();
	}
}



