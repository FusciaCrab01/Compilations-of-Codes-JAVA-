import java.util.Scanner;

public class MultiArray3 {

    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);

    	System.out.print("Enter a row : ");
    	int r = in.nextInt();

    	int arr[][] = new int [r][r];

    	for(int x = 0; x<r; x++)
    	{
    		arr[x][x] = 1;
    		arr[x][0] = 1;

    		System.out.println(arr[x][x]);
    		for (int y=1; y<x; y++)
    		{
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
				System.out.println(arr[x][y]);
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