package Midsem_2022;

import java.lang.Math;
public class Q1b {
	public static void main(String [] args ) {
		int steps=0;
		int t=0;
		do {
			steps++;
			double x=Math.random();
			boolean f;
			if(x>0.5) {
				f=true;
			}
			else 
				f=false;
			System.out.println(String.valueOf(f).toUpperCase());
			if(f==true)
				t++;
			if(f==false)
				t=0;
			
			if(t==3) {
				System.out.println("It took "+steps+" alterations to generate 3 consecutive trues");
				break;
			}
			
			}while(true);
		}
}
