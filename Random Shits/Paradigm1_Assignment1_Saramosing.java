import java.util.Scanner;


public class Paradigm1_Assignment1_Saramosing {

    public static void main(String [] args)

    {
    	//declaring variables
    	int age;
    	String fname , lname , add , eadd , bdate , bplace , mnum;

    	//inputing data
		Scanner in = new Scanner (System.in);

		Scanner in2 = new Scanner (System.in);

		System.out.print("Firstname:");
		fname=in.nextLine();

		System.out.print("Lastname:");
		lname=in.nextLine();

		System.out.print("Age:");
		age=in.nextInt();

		System.out.print("Address:");
		add=in2.nextLine();

		System.out.print("Email Address:");
		eadd=in2.nextLine();

		System.out.print("Mobile Number:");
		mnum=in2.nextLine();

		System.out.print("Birthdate:");
		bdate=in2.nextLine();

		System.out.print("Birthplace:");
		bplace=in2.nextLine();


		//Displaying the data
		System.out.print("\n\n\n");
		System.out.println("**************************************************************");
		System.out.println("**                   Personal Information                   **");
		System.out.println("**            ------------------------------------          **");
		System.out.println("**Firstname:" + fname + "**" );
		System.out.println("**Lastname:" + lname + "**" );
		System.out.println("**Age:" + age + "**" );
		System.out.println("**Address:" + add + "**" );
		System.out.println("**Email Address:" + eadd + "**" );
		System.out.println("**Mobile Number:" + mnum + "**" );
		System.out.println("**Birthdate:" + bdate + "**" );
		System.out.println("**Birtplace:" + bplace + "**" );
		System.out.println("**************************************************************");
    }


}