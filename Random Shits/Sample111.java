import java.util.Scanner;

	public class Sample111
	{
		public static void main (String args [])
		
		{
			Scanner in = new Scanner(System.in);

			System.out.print("Enter 3 numbers ");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int num3 = in.nextInt();

			int small = 0 , large = 0;

			if(num1 > num2  && num1 > num3)
			{
				if (num2 > num3)
				{
					large = num1;
					small = num3;
				}
				else 
				{
					large = num1;
					small = num2;
				}
			}
			else if ( num2 > num1 && num2>num3)
			{
				if (num1 > num3)
				{
					large = num2;
					small = num3;
				}
				else 
				{
					large = num2;
					small = num1;
				}
			}
			else if (num3>num1 && num3>num2)
			{
				if (num1 > num2)
				{
					large = num3;
					small = num2;
				}
				else 
				{
					large = num3;
					small = num1;
				}
			}
			else 
				System.out.println("Invalid Input");
			System.out.println("The Largest number is " + large + "\nThe Smallest number is " + small);
		}


	}