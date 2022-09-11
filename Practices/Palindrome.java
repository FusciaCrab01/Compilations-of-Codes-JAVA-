import java.util.Scanner;


public class Palindrome {

    public static void main (String args [])
    {
	int r , sum=0 , temp;
	Scanner in = new Scanner (System.in);
	System.out.print("Enter a number to check:");
	int num = in.nextInt();

	temp = num;

	for(int x=temp; x>0; x/=10){
		r=x%10;
		sum=(sum*10)+r;
	}
		if(num==sum)
			System.out.println("Palindrome number " + sum);
		else
			System.out.print("Not Palindrome number " + sum);

	}

    }


