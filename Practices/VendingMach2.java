import java.util.Scanner;

public class VendingMach2 {

    public static void main (String args [])
    {
    	Scanner in = new Scanner (System.in);

    	System.out.print("Enter an item number and sum of money : ");
    	int index = in.nextInt();
    	double money = in.nextDouble();

    	if(index == 1)
    	{
    		double prod = 1.25;
    		if (money >= prod)
    		System.out.println("Your change is $ "+ (money - prod));
    		else
    		System.out.println("Please insert $" + (prod - money));
    	}
		else if(index == 2)
    	{
    		double prod = 0.75;
    		if (money >= prod)
    		System.out.println("Your change is $ "+ (money - prod));
    		else
    		System.out.println("Please insert $" + (prod - money));
    	}
    	else if(index == 3)
    	{
    		double prod = 0.90;
    		if (money >= prod)
    		System.out.println("Your change is $ "+ (money - prod));
    		else
    		System.out.println("Please insert $" + (prod - money));
    	}
    	else if(index == 4)
    	{
    		double prod = 0.75;
    		if (money >= prod)
    		System.out.println("Your change is $ "+ (money - prod));
    		else
    		System.out.println("Please insert $" + (prod - money));
    	}
    	else if(index == 5)
    	{
    		double prod = 1.50;
    		if (money >= prod)
    		System.out.println("Your change is $ "+ (money - prod));
    		else
    		System.out.println("Please insert $" + (prod - money));
    	}
    	else if(index == 1)
    	{
    		double prod = .75;
    		if (money >= prod)
    		System.out.println("Your change is $ "+ (money - prod));
    		else
    		System.out.println("Please insert $" + (prod - money));
    	}

    }


}