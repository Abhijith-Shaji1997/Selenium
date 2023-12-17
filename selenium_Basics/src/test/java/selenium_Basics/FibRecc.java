package selenium_Basics;

import java.util.Scanner;

public class FibRecc {
	
	static int a=0;
	 static int b=1;
	 static int c=0;


	public static void main(String[] args) {
		
		System.out.println("Enter count");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		System.out.print(a+ " " +b );
		printfibo(count-2);

		}

		public static void printfibo(int count)
		{
		if(count>0)
		{
		c=a+b;

		System.out.print(" "+c);

		a=b;
		b=c;
		printfibo(count-1);

		}
		}
		


		// TODO Auto-generated method stub

	}


