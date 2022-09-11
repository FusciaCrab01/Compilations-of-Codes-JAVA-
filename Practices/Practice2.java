import java.util.Scanner;

public class Practice2
{
	public static void main (String args[])
	{
		//declare variables
		int x , i=11 , num;
		//input
		Scanner in = new Scanner(System.in);

		System.out.print("Input a number:");
		num=in.nextInt();

		//computation

		//display
		for (x=1; x < i ; x++) {

		System.out.println(num + " x " + x + " = " + (num * x) );
		}
	}



}