import java.util.Scanner;
public class Sample3 {

    public static void main (String [] args) 
    {
    	int age ;
    	
    	Scanner in = new Scanner (System.in);
    	System.out.print("Enter your age:");
    	age = in.nextInt();
    	
    	if (age >= 18 && age <= 150){
    		System.out.print("You are Eligible to vote");
    	}else if (age >= 0 && age <=17){
    		System.out.print("You are not Eligible to vote");
    	}else{
    		System.out.print("Invalid Age");
    	}
    	
    }
    
    
}