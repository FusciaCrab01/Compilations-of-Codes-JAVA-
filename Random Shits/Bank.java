import java.util.Scanner;

public class Bank {

public static void main(String args[]) {

int pin = 1234, withdraw,remain = 0, adep = 0, rem = 0;
boolean access = true, access2 = true, adept = true;
String tra;
int t, t2;

Scanner in = new Scanner(System.in);
System.out.print("==============================================\n");
System.out.print("==============  MyBank's ATM!  ===============\n\n");
System.out.print("Please wait a moment....");
String bye = in.nextLine();
bye = in.nextLine();
System.out.print("\n");
System.out.print("Enter your pin: ");
pin = in.nextInt();
System.out.print("\n\n");
if(pin == 1234){System.out.print("******Pin accepted!******\n\n");
in.nextLine();
in.nextLine();

/*loop for turning until end*/while(access){
System.out.println();
System.out.println("===   MENU   ===");
System.out.println("[1] Deposit");//
System.out.println("[2] Withdraw");
System.out.println("[3] Inquire");
System.out.println("[4] Exit");
System.out.print("Enter your transaction: ");
t = in.nextInt();

/*FOR DEPOSIT  */
if(t == 1) {
System.out.print("\n");
System.out.print("Enter amount deposit: ");
adep = in.nextInt();
adep = adep + remain;
System.out.print("\n\n");
System.out.print("Do you want to transact again?[y]-YES [n]-NO): ");
tra = in.next();
if(tra.equals("y")||tra.equals("Y")){
	
/*while(access2){*/System.out.print("\n\n\n");
System.out.println("===   MENU   ===");
System.out.println("[1] Withdraw");
System.out.println("[2] Inquire");
System.out.println("[3] Exit");
System.out.print("Enter your transaction: ");
t2 = in.nextInt();

/* in the second transaction- WITHDRAW*/
if(t2 == 1){
System.out.print("\n");
System.out.print("Enter amount to withdraw: ");
withdraw = in.nextInt();
remain = adep - withdraw;
adep = remain;
System.out.print("\n\n");
synchronized(args){
try{
System.out.print("Your balance is now P "+remain+".");
in.nextLine();
args.wait(1000);
in.nextLine();
} catch(InterruptedException e){e.printStackTrace();}}
System.out.print("\n\n");
System.out.print("Do you want to transact again?[y]-YES [n]-NO): ");
tra = in.next();
System.out.print("\n\n");
if(tra.equals("N")||tra.equals("n")){
synchronized(args){try{
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){
e.printStackTrace();}System.exit(0);}
}else
if(tra.equals("Y")||tra.equals("y")){
tra = in.nextLine();} else
{synchronized(args){try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}}
rem = 0 + adep;} else

/* in the second transaction- INQUIRE*/
if(t2 == 2){
synchronized(args){try{
System.out.print("\n\n");
System.out.print("You have P "+adep+" balance in your account.");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}}
System.out.print("\n\n");
System.out.print("Do you want to transact again?[y]-YES [n]-NO): ");
tra = in.next();
System.out.print("\n\n");
if(tra.equals("N")||tra.equals("n")){
synchronized(args){try{
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();} catch(InterruptedException e)
{e.printStackTrace();}System.exit(0);}} else
if(tra.equals("Y")||tra.equals("y")){
tra = in.nextLine();}else{
synchronized(args){try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}}}else

/* in the second transaction- EXIT*/
if(t2 == 3){
synchronized(args){try{
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){
e.printStackTrace();
}System.exit(0);}
}else if(t2 > 3 || t2 <=0){
synchronized(args){
try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}}//}//while access2
}else
if(tra.equals("n")||tra.equals("N")){
System.out.print("\n\n");
synchronized(args){try{
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){
e.printStackTrace();
}System.exit(0);}}else

{synchronized(args){try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}}} else
//------------------------------------------------------------
/*FOR WITHDRAW*/
if(t == 2){
System.out.print("\n\n");
System.out.print("Enter amount to withdraw: ");
int withdraw2 = in.nextInt();
remain = adep - withdraw2;
adep = remain;
System.out.print("\n\n");
synchronized(args){try{
if(remain == 0){System.out.print("You have zero balance in your account!");
in.nextLine();} else{
System.out.print("You have P "+remain+" balance in your account.");
in.nextLine();}
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){
e.printStackTrace();}}
System.out.print("\n\n");
System.out.print("Do you want to transact again?[y]-YES [n]-NO): ");
tra = in.next();
System.out.print("\n\n");
if(tra.equals("N")||tra.equals("n")){
synchronized(args){try{
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();}catch(InterruptedException e){
e.printStackTrace();}System.exit(0);}
}else if(tra.equals("Y")||tra.equals("y")){
tra = in.nextLine();}else{
synchronized(args){try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}}
rem = 0 + adep;} else

/*FOR INQUIRE*/
if(t == 3){synchronized(args){try{
System.out.print("\n\n");
System.out.print("You have P "+adep+" balance in your account.");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}}
System.out.print("\n\n");
System.out.print("Do you want to transact again?[y]-YES [n]-NO): ");
tra = in.next();
System.out.print("\n\n");
if(tra.equals("N")||tra.equals("n")){
synchronized(args){try{
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();}catch(InterruptedException e){
e.printStackTrace();
}System.exit(0);}}else
if(tra.equals("Y")||tra.equals("y")) {
tra = in.nextLine();}else{
synchronized(args){try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}}} else

/*FOR EXIT*/
if(t == 4) {synchronized(args){try{
System.out.print("\n\n");
System.out.println("Bye!");
System.out.println("Thank you for banking with us.");
in.nextLine();
args.wait(1000);
in.nextLine();
access2 = false;
in.close();
System.exit(0);}
catch(InterruptedException e){
e.printStackTrace();}}}else

 /*IF THE OUT OF THE CHOICES*/
if(t <= 0 || t > 4){
synchronized(args){try{
System.out.print("\n\n");
System.out.print("Invalid choice!");
in.nextLine();
args.wait(1000);
in.nextLine();
}catch(InterruptedException e){e.printStackTrace();}
System.out.print("\n\n");}

}//while
}}//if the pin is correct
//This will execute if the pin is wrong
else{synchronized(args){try{
System.out.print("\n\n");
System.out.print("******   Invalid pin!  ******\n\n");
System.out.print("******Please try again!******\n\n");
System.out.print("Will now exit in...");
in.nextLine();
args.wait(1000);
in.nextLine();
System.exit(0);
} catch(InterruptedException e){
e.printStackTrace();}}}
}//method
}//class