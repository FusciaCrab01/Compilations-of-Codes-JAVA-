
import java.util.Scanner;

public class JavaMachineProb2_Saramosing {

    public static void main(String args[]){

    Scanner in= new Scanner(System.in);
    int h=0;
    int x=2;
    char ch, ch1, ch2;
    int balance=0;

	int pin=1234;

	System.out.println("\tMY ATM BANK\t");
	System.out.println("\n");
	System.out.print("Enter your pin:");
	pin= in.nextInt();

	while(pin != 1234){
		System.out.println("Incorrect pin!");
		System.out.print("Enter your pin: ");
    	pin= in.nextInt();
	}

	do{
	System.out.println("Pin accepted!");
    System.out.println("\n");
    System.out.println("\tMENU\t");
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
					if(ch2 == 'n'){
						System.out.print("Thank you for banking with us!.");
						System.exit(1);
					}
					if(ch2 == 'y'){
						do{
							Scanner n1= new Scanner(System.in);
							System.out.println("\n\tMENU\t");
		    			    System.out.println("[1] Withdraw");
		    			    System.out.println("[2] Inquire");
		    			    System.out.println("[3] Exit");

		    			    System.out.print("Enter your transaction: ");
		    			    int trans1= n1.nextInt();

		    			    if(trans1 == 1){
		    			    	System.out.print("Enter amount to withdraw: ");
							    int withdraw= n1.nextInt();
								balance-=withdraw;
								System.out.println("You have "+balance+" balance in your account.");
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
									if(ch == 'n'){
										System.out.print("Thank you for banking with us!.");
										System.exit(1);
									}

									if(ch == 'y'){
										continue;
									}

									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
									}



						 }while(ch == 'y');
									}else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										 }

					}while(ch2 == 'y');
    	}else if(trans == 2){
    	System.out.print("Enter amount to withdraw: ");
        int withdraw= in.nextInt();
    	System.out.println("You hava 0 balance in your account.");
    	}else if(trans ==3){
    		System.out.println("You have 0 balance in your account.");
    	}else{
    	System.out.print("Thank you for banking with us. Bye!");
    	System.exit(1);
    	}

    		System.out.print("Do you want to transact again? [y]-Yes [n]-No :");
				ch1= in.next().charAt(0);
					if(ch1 == 'y'){
						continue;
					}

					if(ch1 == 'n'){
						System.out.print("Thank you for banking with us!.");
						System.exit(1);
					}
					else{
						System.out.print("\n");
						System.out.println("Invalid Choice!");
					}

	}while(ch1 == 'y');

}
}