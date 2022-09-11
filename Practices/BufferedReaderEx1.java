import java.io.*;

public class BufferedReaderEx1 {

    public static void main ( String args [])
    {
    	BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

    	String name = " " ;

    	System.out.print("Please Enter a Name :");
    		try {
    			name = in.readLine();
    		} catch(IOException e ){
    			System.out.println("Error!");
    		}
    	System.out.println("Hello " + name + "!");
    }


}