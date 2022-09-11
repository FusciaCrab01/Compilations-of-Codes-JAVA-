import java.util.Scanner;

public class Sample8
{

	public static void main (String args [])
	{
		//declare
		String name;
		int numg , x ;
		double grd , tgrd = 0 , ave;

		//Input 1
		Scanner in = new Scanner (System.in);
		System.out.print("Student Name  :");
		name = in.nextLine();

		System.out.print("No. of Grades (2-8):");
		numg = in.nextInt();

		//Input 2

		for (x=1; x<=numg; x++)
		{
			System.out.println("Grade No. " + x);
			System.out.print("Grade (60.0 - 100.0) :");
			grd = in.nextDouble();

			tgrd += grd;
		}

		//compute
		ave = tgrd/numg;

		//display

		System.out.println("Grading Slip");
		System.out.println("Student Name :" + name);
		System.out.printf("Average       :%7.2f" , ave);
	}



}