import java.util.Scanner;

public class Assignment1 {

    public static void main (String args [])
    {
    	//declare variables
    	int cost ;
    	double tip , tot;

    	//input

    	Scanner in = new Scanner (System.in);
    	System.out.print("The meal costs: ");
    	cost = in.nextInt();

    	//computation
    	tip = cost * 0.15;
    	tot = cost + tip;

    	//display
    	System.out.println("The 15% tip is: " + tip);
    	System.out.println("The total bill is: " + tot );
    }


}