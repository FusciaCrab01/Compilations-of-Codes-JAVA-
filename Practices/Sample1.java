import java.util.Scanner;

public class Sample1 {

    public static void main (String args []) 
    {
    	//declare variables 
    	int test = 2 , input , test1 ;
    	
    	//input
    	Scanner in= new Scanner (System.in);
    	
    	System.out.print("Enter a number:");
    	input = in.nextInt();
    	
    	//computation
		    test1 = (input%test);	
    	if (test1 == 0) { 
    		System.out.println(input + " is an even number");
    	} else {
    		System.out.println(input + " is an even odd");
    	}
    }
    
    
}