import java.util.Scanner;

public class TenMinCoding {

    public static void main (String args [])
    {

    	Scanner in = new Scanner (System.in);
		char  ch;
		String update = "";

    do{	System.out.print("Enter a number :");
    	int num = in.nextInt();


		String arr [] = new String [num+1];
    	for (int x=0; x<=num; x++)
    	{
			arr[x] = in.nextLine();
    	}


		System.out.println("[1] UPPERCASE\n[2] lowercase");
		System.out.print("Enter your Choice:");
		int choi = in.nextInt();

		if( choi == 1)
		{
			for(int x=0; x<=num; x++)
			{
				update =arr[x];
				System.out.print((update.toUpperCase())+"\n");
			}
		}
		else
		{
		for(int x=0; x<=num; x++)
			{
				update =arr[x];
				System.out.print((update.toLowerCase())+"\n");
			}
		}

		System.out.print("\nDo you want to try again? [y]-Yes [n]-No :");
				ch = in.next().charAt(0);
					if(ch == 'y' || ch == 'Y'){
						continue;
					}

					if(ch == 'n' || ch == 'N'){

					}
					else{
						System.out.print("\n");
						System.out.println("Invalid Choice!");
					}
				}while(ch == 'y' || ch =='Y');

    	}
    }


