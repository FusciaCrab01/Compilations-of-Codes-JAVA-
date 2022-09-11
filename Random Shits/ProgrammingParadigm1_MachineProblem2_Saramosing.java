
import java.util.Scanner;

public class ProgrammingParadigm1_MachineProblem2_Saramosing {

    public static void main(String args[]){

    Scanner in= new Scanner(System.in);

    char ch, ch1, ch2;
    int balance=0 , pin=1234 , x=2 , h=0;

	System.out.println("==================================");
	System.out.println("==========\tMY ATM BANK\t==========");
	System.out.print("Please wait a moment...");
	String hulat = in.nextLine();
	String hula1 = in.nextLine();
	System.out.println();
	System.out.print("Enter your pin:");
	pin= in.nextInt();

	while(pin != 1234){
		System.out.println("*****Invalid pin!*****\n");
		System.out.println("***Please try again***\n");
		System.out.print("Enter your pin: ");
    	pin= in.nextInt();
	}

	do{
	System.out.println("\n");
	System.out.println("****Pin accepted!****");
	String hula2 = in.nextLine();
	String hula3 = in.nextLine();
    System.out.print("\n");
    System.out.println("===\tMENU ===");
    System.out.println("[1] Deposit");
    System.out.println("[2] Withdraw");
    System.out.println("[3] Inquire");
    System.out.println("[4] Exit");

    System.out.print("Enter your transaction: ");
    int trans= in.nextInt();

		if(trans == 1){
			System.out.print("Enter amount to deposit: ");
			int deposit = in.nextInt();
			balance +=deposit;
				do{
					Scanner n2= new Scanner(System.in);
				    System.out.print("Do you want to transact again? [y]-Yes [n]-No :");
					ch2= n2.next().charAt(0);
					if(ch2 == 'n' || ch2 == 'N'){
						System.out.print("Thank you for banking with us!.");
						System.exit(1);
					}
					if(ch2 == 'y' || ch2 == 'Y'){
						do{
							Scanner n1= new Scanner(System.in);
							System.out.println("\n===\tMENU\t===");
		    			    System.out.println("[1] Withdraw");
		    			    System.out.println("[2] Inquire");
		    			    System.out.println("[3] Exit");

		    			    System.out.print("Enter your transaction: ");
		    			    int trans1= n1.nextInt();

		    			    if(trans1 == 1){
		    			    	System.out.print("Enter amount to withdraw: ");
							    int withdraw= n1.nextInt();
							    if(balance >= withdraw){
							    balance-=withdraw;
								System.out.println("You have "+balance+" balance in your account.");
								}else{
								System.out.println("Insufficient balance");
								}

		    			    }
		    			    else if(trans1 == 2){
		    			    	System.out.println("You have "+balance+" in your account.");
		    			    }
		    			    else if(trans1 == 3){
		    			    	System.out.print("Thank you for banking with us!.");
		    			    	System.exit(1);
		    			    }
		    			    else{
		    			    	System.out.print("\n");
		    			    	System.out.println("Invalid choice");
		    			    }

					    		System.out.print("Do you want to transact again? [y]-Yes [n]-No :");
								ch= n1.next().charAt(0);
									if(ch == 'n' || ch == 'N'){
										System.out.print("Thank you for banking with us!.");
										System.exit(1);
									}

									if(ch == 'y' || ch == 'Y'){
										continue;
									}

									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										System.exit(1);
									}



						 }while(ch == 'y' || ch == 'Y');
									}else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										System.exit(1);
										 }

					}while(ch2 == 'y' || ch2 == 'Y');
    	}else if(trans == 2){
    	System.out.print("Enter amount to withdraw: ");
        int withdraw= in.nextInt();
    	System.out.println("You have zero balance in your account!");
    	}else if(trans ==3){
    		System.out.println("You have 0 balance in your account.");
    	}else if(trans ==4 ){
    	System.out.print("Thank you for banking with us. Bye!");
    	System.exit(1);
    	}else {
    	System.out.println("Invalid transaction!");
    	}

    		System.out.print("Do you want to transact again? [y]-Yes [n]-No :");
				ch1= in.next().charAt(0);
					if(ch1 == 'y' || ch1 == 'Y'){
						continue;
					}

					if(ch1 == 'n' || ch1 == 'N'){
						System.out.print("Thank you for banking with us!.");
						System.exit(1);
					}
					else{
						System.out.print("\n");
						System.out.println("Invalid Choice!");
					}

	}while(ch1 == 'y' || ch1 == 'Y');

}
}