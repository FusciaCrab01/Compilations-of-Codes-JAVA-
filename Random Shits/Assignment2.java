import java.util.Scanner;

public class Assignment2 {

    public static void main (String args [])
    {
    	//declare variables
    	int prod ;
    	double tax , tot;

    	//input

    	Scanner in = new Scanner (System.in);
    	System.out.print("Enter the product: ");
    	prod = in.nextInt();

    	//computation
    	tax = prod * 0.05;
    	tot = prod + tax;

    	//display
    	System.out.println("5% tax is: " + tax);
    	System.out.println("The Cost is: " + tot );
    }


}