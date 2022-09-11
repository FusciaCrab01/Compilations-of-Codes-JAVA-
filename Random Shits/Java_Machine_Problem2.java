import java.util.Scanner;

public class Java_Machine_Problem2 {

    public static void main (String args [])
    {
    	int pin , pin1=14321 , tran , depo;
    	String tra1;

    	Scanner in = new Scanner (System.in);
		Scanner in2 = new Scanner (System.in);

		System.out.println("==================================================");
		System.out.println("==================  MyBank's ATM  ================");
		System.out.println("Please wait a moment......");


		System.out.print("Enter your pin: ");
		pin = in.nextInt();

		if (pin == pin1){
			System.out.println("******Pin accepted!******");

			System.out.println("====  MENU  ====");
			System.out.println("[1] Deposit");
			System.out.println("[2] Withdraw");
			System.out.println("[3] Inquire");
			System.out.println("[4] Exit");

			System.out.print("Enter your transaction:");
			tran = in.nextInt();

			if (tran == 1){
				System.out.print("Enter amount to deposit: ");
				depo = in.nextInt();

				System.out.print("Do you want to transact again? [y]-Yes [n]-No :");
				tra1 = in2.nextLine();
			}

		}else{
			System.out.println("\n");
			System.out.println("******* Invalid Pin! ********\n");
			System.out.println("******Please Try Again!******\n");
			System.out.println("Will now exit in");
			System.exit(0);
		}

    }


}