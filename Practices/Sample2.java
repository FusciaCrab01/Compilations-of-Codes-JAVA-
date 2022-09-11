import java.util.Scanner;

public class Sample2 {

    public static void main (String args [])
    {
    int magic_number = 143 , input;

    Scanner in = new Scanner (System.in);

    System.out.print("Input a number:");
   	input = in.nextInt();

   	/* if (input == magic_number){
   		System.out.print("Congrats you guess the magic number");
   	} else if (input < 0){
   		System.out.print("Invalid Number");
   	}
   	else {
   		System.out.print("Better luck next time");
   	}
   	*/
   	switch (input){
   		case 143:
   			System.out.print("Congrats you guess the magic number" );
   		break;

   		default:
   			System.out.print("Better Luck Next Time");
   	}

    }


}