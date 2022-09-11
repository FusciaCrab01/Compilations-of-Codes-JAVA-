import java.util.Scanner;
 public class Finals_Java_Exer10_Saramosing
 {
 	public static void main (String args [])
 	{
 		Scanner in = new Scanner (System.in);

 		System.out.print("Enter an element : ");
 		int num = in.nextInt();

 		System.out.println("The size of your matrix is "+num +"x"+num);
 		System.out.println("The size of your array is "+num*num);

 		int arr [][] = new int [num][num];

 		int hold, a , b=0;

 		System.out.println("Enter unique elements :");
 		for (int x = 0; x<arr.length; x++)
 		{
 			for (int y = 0; y<arr.length; y++)
 			{
 				do{
 				hold = in.nextInt();
 				int holder;
 				holder = test(hold, b);
 				if (holder ==1)
 				{
 					System.out.println("Cannot accept duplicate items!");
 				}
 				}while(hold == b);
 				arr[x][y]  = hold;
 				b = arr[x][y];
 			}

 		}
 			int holder;
 			holder = display(arr);
 	}

 	public static int test(int a, int b)
 	{
 		int c = 0;
 		if(a == b)
 		{
 			c = 1;
 		}
 		return c;
 	}

 	public static int display(int arr [][])
 	{
 		System.out.println("Displaying the matrix");
 		for (int x = 0; x<arr.length; x++)
 		{
 			for (int y = 0; y<arr.length; y++)
 			{
 				System.out.print(arr[x][y] + " " );
 			}
 			System.out.println();
 		}


		int sumH[] = new int [arr.length];
		int sumV[] = new int [arr.length];
		for (int x=0; x<arr.length; x++)
		{
			for (int y = 0; y<arr.length; y++)
			{
			sumH[x] += arr[x][y];
			sumV[y] += arr[x][y];
			}
		}

			int diagsum1 = 0 , diagsum2 = 0;

			System.out.print("Horizontal Sum : ");
			for(int y = 0; y<arr.length; y++)
			{
				System.out.print(sumH[y] + " ");
			}



			System.out.print("\nVertical Sum : ");
			for(int x = 0; x<arr.length; x++)
			{
				System.out.print(sumV[x] + " ");
				diagsum1 += arr[x][x];
				diagsum2 += arr[x][arr.length-1-x];
			}



			System.out.println("\nThe right diagonal sum is :" + +diagsum1);
			System.out.println("The left diagonal sum is :" + +diagsum2);

 		return 1;

 	}


 }