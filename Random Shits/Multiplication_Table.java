import java.util.Scanner;


public class Multiplication_Table {

    public static void main (String args[])
    {

    	//declare variables
    	int col , row , snum , x , y , c;

    	Scanner in = new Scanner(System.in);

    	System.out.print("Starting number :");
    	snum = in.nextInt();

    	System.out.print("Enter a # of rows :");
    	row = in.nextInt();

    	System.out.print("Enter a # of columns :");
    	col = in.nextInt();

    	col +=snum-1;
    	row +=snum-1;


    		System.out.print("x");
    		for (c=snum; c<=col; c++){
    			System.out.print("\t" + c );
    		}System.out.print("\n");

    	for(x=snum; x<=row; x++){
    	System.out.print(x + "\t");

			for(y=snum; y<=col; y++){
			System.out.print(y * x + "\t");
			}

    	System.out.print( "\n");
   		}
    }




}