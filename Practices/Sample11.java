import java.util.Scanner;


public class Sample11 {

    public static void main (String args[])

    {
    	int num1 = 8 , num2 = 1 , num3 = 6;
    	int smallest  = 0, largest = 0;

    	if(num1>num2)
    	{
    		if(num1>num3)
    		{
    			largest = num1;
    			smallest = num3;
    		}
    		else
    		{
    			largest = num3;
    			smallest = num2;
    		}
    	}
    	else
    	{
    		if(num2>num3)
    		{
    			largest = num2;
    			smallest = num3;
    		}
    		else
    		{
    			largest = num3;
    			smallest = num1;
    		}
    	}

    	System.out.println("The largest is " + largest);

//    	if(num1<num2)
//    	{
//    		if(num1<num3)
//    		{
//    			smallest = num1;
//    		}
//    		else
//    		{
//    			smallest = num3;
//    		}
//    	}
//    	else
//    	{
//    		if(num2<num3)
//    		{
//    			smallest = num2;
//    		}
//    		else{
//    			smallest = num3;
//    		}
//    	}
    	System.out.println("The smallest is " + smallest);
    }


}