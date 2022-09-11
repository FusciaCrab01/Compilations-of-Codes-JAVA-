import javax.swing.*;


public class JOptionPaneEx2 {

	private JLabel Label1;

    public static void main (String [] args )
    {

		String fname = "" , lname= "" , add="" , eadd="" , bdate="" , bplace="" , mnum="" , age = "";

		Label1 = new JLabel ("A Simple Label");
		fname = JOptionPane.showInputDialog("Please input Firstname");
		lname = JOptionPane.showInputDialog("Please input Lastname");
		add = JOptionPane.showInputDialog("Please input Address");
		age = JOptionPane.showInputDialog("Please input Age");
    	eadd = JOptionPane.showInputDialog("Please input Email Address");
    	bdate = JOptionPane.showInputDialog("Please input Birth Date");
    	bplace = JOptionPane.showInputDialog("Please input Birth Place");
   		mnum = JOptionPane.showInputDialog("Please input Mobile Number");

		Panel.add (Label1);

   		String output = " ***Personal information***\n\n" +
   			"Your name is " + lname + ", " + fname + "\n" +
   			"You live in " + add + "\n" +
   			"You are " + age + " years old \n" +
   			"Your Email Address" + eadd + "\n" +
   			"Your Birthday is " + bdate + "\n" +
   			"You are Born in " + bplace + "\n" +
   			"Your Mobile number is " + mnum + "\n" ;

   		JOptionPane.showMessageDialog(null, output);
    }


}