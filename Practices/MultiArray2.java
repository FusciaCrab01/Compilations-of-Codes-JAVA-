import java.util.Scanner;


public class MultiArray2 {

    public static void main (String args[])
    {
    	Scanner in = new Scanner(System.in);

    	System.out.print("Enter a number of row:");
    	int r = in.nextInt();

    	int arr[][] = new int [r][r];

    	arr[0][0] = 1;
    	arr[1][0] = 1;
    	arr[1][1] = 1;

    	for (int x = 2; x<r; x++)
    	{
    		for (int y = 0; y<r; y++)
    		{
    			if(x>y)
    			{
    				arr[x][y] = arr[x-1][y] + arr[x-2][y];
//    				System.out.println(arr[x][y]+"if");
    			}
    			else
    			{
    				arr[x][y] = arr[x-1][y-1] + arr[x-2][y-2];
//    				System.out.println(arr[x][y] +"else");
    			}
    		}
    	}

    	for (int x = 0; x<r; x++)
    	{
    		for (int c=x; c<r; c++)
    		{
    			System.out.print(" ");
    		}

    		for (int y = 0; y<=x; y++)
    		{
				System.out.print(arr[x][y] + " ");
    		}
    		System.out.println();
    	}
    }


}