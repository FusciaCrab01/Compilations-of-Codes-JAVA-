
public class BreakLoop {

    public static void main(String args []){
    	for (int i=0; i<100; i++){
    		if(i > 90)break;
    		System.out.println("i : " + i);
    	}
    	System.out.print("Loop Complete.");
    }


}