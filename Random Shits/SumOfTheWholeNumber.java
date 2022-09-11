import java.util.Scanner;

public class SumOfTheWholeNumber {

    public static void main (String args[])
    {
    	//declaring variables
    	int x , sum = 0 , num , rem;

    	Scanner in = new Scanner(System.in);

    	System.out.print("Enter a number : ");
    	num = in.nextInt();

    	for(x = num
    		;x>0;
    		){
    		rem = x % 10;
		 	sum = sum + rem;
		 	x= sum + rem;
    	}
    	System.out.print("The Sum of the number is: " + sum);
    }


}