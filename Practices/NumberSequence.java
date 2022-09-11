import java.util.Scanner;

public class NumberSequence {

    public static void main (String args [])
   	{
   		Scanner in = new Scanner (System.in);

   		System.out.print("Enter a number of rows:");
   		int rows = in.nextInt();
		int odd = 1 , numSpace = 0;

   		 numSpace=rows-1;

   		for(int x=1; x<=rows; x++)
   			{

			System.out.print("\t");
   			int k=0;

   			for(int y=1; y<=numSpace; y++)
   				{
   				System.out.print(" ");
   				}

   			for(int y=1; y<=odd; y++)
   				{
   					if (y<=x)
   					{
   						k+=1;
   					}
   					else
   					{
   						k-=1;
   					}
   				System.out.print(k);
   				}
   			System.out.println();

   			odd+=2;
   			numSpace-=1;

   		   }
    }


}