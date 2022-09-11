import java.util.Scanner;

public class PalindromeString {

    public static void main(String args [])
   	{
		String original , reverse = "";

		Scanner in = new Scanner (System.in);

		System.out.print("Enter a String/Number to check : ");
		original=in.nextLine();

		int length = original.length();

		for (int i = length-1 ;i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
			//System.out.println(reverse);
		}

		if(original.equals(reverse))

		System.out.println("Entered string/number is a palindrome");

		else

		System.out.println("Entered stirng/number is not a palindrome");

    }


}