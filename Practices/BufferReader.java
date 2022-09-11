import java.io.*;

public class BufferReader {

    public static void main(String [] args)throws IOException
    {
    	//declare variables
    	String lname , fname , mname, age  , add , eadd , mnum;
		int age1;

    	//input data
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

   		System.out.println("Please input the following information:");

   		System.out.print("Lastname:");
   		lname=in.readLine();

   		System.out.print("Firstname:");
   		fname=in.readLine();

   		System.out.print("Middlename:");
   		mname=in.readLine();

   		System.out.print("Age:");
   		age=in.readLine();
   		age1=Integer.parseInt(age);

   		System.out.print("Address:");
   		add=in.readLine();

   		System.out.print("Email Address:");
   		eadd=in.readLine();

   		System.out.print("Mobile Number:");
   		mnum=in.readLine();

   		//displaying data
   		System.out.print("\n\n\n");
   		System.out.println("Displaying your Personal Information:");
   		System.out.println("Hello "+ fname + "!");
   		System.out.println("Welcome!");
    	System.out.println("Your fullname is "+ fname + " " + mname + " " + lname + ".");
    	System.out.println("You are " + age1 + " years old.");
    	System.out.println("You live in "+ add + ".");
    	System.out.println("Your email address is: "+ eadd);
    	System.out.println("Your mobile number is " + mnum + ".");
    }



}