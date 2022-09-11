import java.util.Scanner;

public class VendingMach {

    public static void main(String args [])
    {
    	Scanner in = new Scanner (System.in);

		double arr [] = { 0, 1.25, 0.75, 0.90, 0.75, 1.50, .75};

	    	System.out.print("Enter an item number and sum of money : ");
	    	int index = in.nextInt();
	    	double money = in.nextDouble();

			if (money >= arr[index])
			{
				System.out.println("Your change is $" + (money - arr[index]));
			}
			else
			{
				System.out.print("Please insert $" + (arr[index] - money));
			}
    }
}