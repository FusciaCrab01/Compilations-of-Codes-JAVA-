import java.util.Scanner;

public class Exam {

    public static void main (String args [])
    {
		Scanner in = new Scanner (System.in);

		System.out.print("Enter a starting number:");
		int x = in.nextInt();

		System.out.print("Enter a number of rows:");
		int as = in.nextInt();

		int y=x;


		for(int j = 0; j<=as; j++){
			for (int i = 1; i<=j; i++){
				System.out.print(y + " ");
				y+=x;
			}
			System.out.println();
			}
		}
    }
