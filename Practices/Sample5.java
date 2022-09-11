import java.util.Scanner;

public class Sample5 {

    public static void main (String args [])
    {
    	int num1 = 0, num2 = 0 , num3 = 0 , grade = 0;

    	Scanner in = new Scanner (System.in);

    	System.out.print("Quize score:");
    	num1 = in.nextInt();
    	if (num1 < 0 || num1 > 100) {
    	System.out.print("Invalid Grade");
    	}else{
    	System.out.print("Mid-Term score:");
    	num2 = in.nextInt();
    	if (num2 < 0 || num2 > 100) {
    	System.out.print("Invalid Grade");
    	}else{
    	System.out.print("Final score:");
    	num3 = in.nextInt();
    	if (num3 < 0 || num3 > 100) {
    	System.out.print("Invalid Grade");
    	}else {

    	//compute
    	grade = (num1+num2+num3)/3 ;

    	if (grade >= 90 && grade <= 100){
    	System.out.print("Your Grade is A");
    	}else if (grade >= 70 && grade < 90){
    	System.out.print("Your Grade is B");
    	}else if (grade >= 50 && grade < 70){
    	System.out.print("Your Grade is C");
    	}else if (grade < 50){
    	System.out.print("Your Grade is F");
    	}

    }}}

    }


}