import java.util.Scanner;

public class Practice_1
{
    public static void main (String [] args)
   	{
 		//declaring Variables

 		double a , b , c ;

 		//input data

 		Scanner in = new Scanner (System.in);

 		System.out.print("Input the First value :");
 		a = in.nextInt();

 		System.out.print("Input the Second value :");
 		b=in.nextInt();


 		c = Math.sqrt( a*a+b*b);

 		//Display data

 		System.out.printf("Hypotenuse is %7.2f " , c );

    }


}