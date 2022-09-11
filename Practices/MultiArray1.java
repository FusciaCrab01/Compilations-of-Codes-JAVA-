import java.util.Scanner;
public class MultiArray1 {

    public static void main (String args[])
    {
    	Scanner in = new Scanner(System.in);

    	System.out.print("Enter a row and column :");
    	int row = in.nextInt();
    	int col = in.nextInt();
    	System.out.print("Starting number :");
    	int snum = in.nextInt();
    	int arr [] [] = new int [row][col];

		int first = snum;

    	for(int x = 0; x<row; x++)
    	{
    		int second = snum;
    		for(int y = 0; y<col; y++)
    		{
				arr[x][y] = first*second;
				second++;
    		}
    		first++;
    	}

			int abc = snum;
    		System.out.print("x");
    		for (int c=0; c<col; c++){

    			System.out.print("\t" + abc );
    			abc++;
    		}
    		System.out.print("\n");

			int third = snum;
    	for(int x = 0; x<row; x++)
    	{
    		System.out.print(third + "\t");
    		for(int y = 0; y<col; y++)
    		{
				System.out.print(arr[x][y] + "\t");
    		}
    		System.out.println();
			third++;
    	}
    }


}