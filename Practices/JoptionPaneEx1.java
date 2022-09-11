import javax.swing.*;


public class JoptionPaneEx1 {

    public static void main (String [] args) {
    String name = " " ;
		name = JOptionPane.showInputDialog("Please Input Your Name");
		String msg = "Hello " + name + "!" ;
		JOptionPane.showMessageDialog(null , msg);
    }


}