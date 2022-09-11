import java.util.Scanner;


public class MultArray4 {

    public static void main (String args[])
    {
    	Scanner in = new Scanner(System.in);

    	System.out.print("Enter row of the two matrix :");
    	int row = in.nextInt();

    	System.out.print("Enter col of the two matrix :");
    	int col = in.nextInt();

    	int Farr[][] = new int [row][col];
    	int Sarr[][] = new int [row][col];
    	int Tarr[][] = new int [row][row];

    	System.out.println("Enter elements in First Matrix ");
    	for (int x = 0; x<row; x++)
    	{
    		for (int y=0; y<col; y++)
    		{
			 Farr[x][y] = in.nextInt();
    		}
    	}

    	System.out.println("Enter elements in Second Matrix ");
    	for (int x = 0; x<row; x++)
    	{
    		for (int y=0; y<col; y++)
    		{
			 Sarr[x][y] = in.nextInt();
    		}
    	}

    	System.out.println("The First Matrix :");
    	for (int x = 0; x<row; x++)
    	{
    		for (int y=0; y<col; y++)
    		{
			 System.out.print(Farr[x][y] + " ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    	System.out.println("The Second Matrix :");
    	for (int x = 0; x<row; x++)
    	{
    		for (int y=0; y<col; y++)
    		{
			 System.out.print(Sarr[x][y] + " ");
    		}
    		System.out.println();
    	}

    	System.out.println("After adding two Matrix");
    	for (int x = 0; x<row; x++)
    	{
    		for (int y=0; y<col; y++)
    		{
			 Tarr[x][y] = Farr[x][y] + Sarr[x][y];
			 System.out.print(Tarr[x][y] + " ");
    		}
    		System.out.println();
    	}

		int last;
		int run;
    	for (int x = 0; x<row; x++)
    	{
    		for (int y=0; y<col; y++)
    		{
    			for (int z = 0; z<row; z++)
    			{
    				for (int c = 0; c<col; c++)
			    	{
						if(Sarr[z][c] > Sarr[x][y])
						{
						last = Sarr[z][c];
						Sarr[z][c] = Sarr[x][y];
						Sarr[x][y] = last;
						}
						if(Farr[z][c] > Farr[x][y])
						{
						run = Farr[z][c];
						Farr[z][c] = Farr[x][y];
						Farr[x][y] = run;
						}
			    	}
    			}
    		}
    	}


//    	for (int x = 0; x<row; x++)
//    	{
//    		for (int y=0; y<col; y++)
//    		{
//    			for (int z = 0; z<row; z++)
//    			{
//    				for (int c = 0; c<col; c++)
//			    	{
//						if(Farr[z][c] > Farr[x][y])
//						{
//						run = Farr[z][c];
//						Farr[z][c] = Farr[x][y];
//						Farr[x][y] = run;
//						}
//			    	}
//    			}
//    		}
//    	}

		System.out.println("First Matrix After sorting");
		for(int x = 0; x<row; x++)
    	{
    		for (int y = 0; y<col; y++)
    		{
			System.out.print(Farr[x][y]+ " ");
    		}
    	System.out.println();
    	}

		System.out.println("Second Matrix After sorting");
    	for(int x = 0; x<row; x++)
    	{
    		for (int y = 0; y<col; y++)
    		{
			System.out.print(Sarr[x][y] + " ");
    		}
    	System.out.println();
    	}


    	System.out.println("Adding After sorting");
    	for(int x = 0; x<row; x++)
    	{
    		for (int y = 0; y<col; y++)
    		{
    		Tarr[x][y] = Farr[x][y] + Sarr[x][y];
			System.out.print(Tarr[x][y] + " ");
    		}
    	System.out.println();
    	}







    }


}