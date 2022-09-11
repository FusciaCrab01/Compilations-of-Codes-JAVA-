import java.util.Scanner;


public class Sample4 {

    public static void main (String args [])
    {
    	int num1, num2 , num3;

    	Scanner in = new Scanner (System.in);

    	System.out.print("Input the 1st number:");
    	num1 = in.nextInt();

    	System.out.print("Input the 2nd number:");
    	num2 = in.nextInt();

    	System.out.print("Input the 3rd number:");
    	num3 = in.nextInt();

    	if (num1 > num2 && num1 > num3){
    	System.out.print("The largest number is :" + num1);
    	}else if (num2> num1 && num2 > num3){
    	System.out.print("The largest number is :" + num2);
    	}else if (num3> num1 && num3 > num2){
    	System.out.print("The largest number is :" + num3);
    	}else{
    	System.out.print("Invalid Number");
    	}

    }


}