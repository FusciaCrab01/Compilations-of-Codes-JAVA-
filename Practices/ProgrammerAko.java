
import java.util.Scanner;
public class ProgrammerAko {

    public static void main(String args[])
    {
    	Scanner in = new Scanner (System.in);


    	System.out.print("Enter Size of array ");
    	int n = in.nextInt();

    	int [] arr = new int [n];

    	System.out.println("Enter the values");
    	for(int x = 0; x<arr.length; x++)
    	{
    		arr[x] = in.nextInt();
    	}

    	int count = 0;
    	for(int x = 0; x<arr.length; x++)
    	{
    		int arrCount = n;
    		if(x == n-1 )
    		{
    			arrCount = n-1;
    		}
    		for(int y = 0; y<arrCount; y++)
    		{
    			if(arr[x] == arr[y])
    			{
				count = 0;
    			}
    			else
    			{
    			count = arr[x];
    			}
    		}
    	}

    	if(count == 0)
    	{
    		System.out.println("No unique numbers!");
    	}
    	else
    	{
			System.out.println(count);
    	}
    }


}