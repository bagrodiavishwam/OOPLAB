package lab2;

import java.util.*;
public class Q2_printsum {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		int sum=0;
		for(int i=0;i<10;i++){
		System.out.println("Enter value number: "+(i+1));
		a[i]=sc.nextInt();
		sum+=a[i];
		}
		System.out.println("The sum is: "+sum);
		sc.close();
		}
		}
	}
}
