import java.util.Scanner;
 public class Multiplication_table1 {

    public static void main (String args [])
    {
    	//declare variables
    	int  row , col , y , x;

    	Scanner in = new Scanner(System.in);

    	do{System.out.print("Row (1-20) : ");
    	row = in.nextInt();}
		while (row < 1 || row > 20);

    	do{System.out.print("Column (1-20) : ");
    	col = in.nextInt();}
    	while (col < 1 || col > 20);

			System.out.print("\nMultiplication Tables\n");
		for (y=1; y<=col; y++){
				System.out.print("\n");
			for (x=1; x<=row; x++){
				System.out.print(y*x + "\t");
			}
		}	System.out.print("\n\n");
    }


}