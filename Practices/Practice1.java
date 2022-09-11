import java.util.Scanner;

public class Practice1 {

    public static void main (String args [] )
    {
    	//declare variable
    	 int fnum , snum , a , s , m , d , md ;

    	//input
    	Scanner in = new Scanner (System.in);

    	System.out.print("Input the first number:");
		fnum=in.nextInt();

		System.out.print("Input the second number:");
		snum=in.nextInt();

		//computation
		a = fnum + snum ;
		s = fnum - snum ;
		m = fnum * snum ;
		d = fnum / snum ;
		md = fnum % snum ;

		//display
		System.out.println( fnum + " + " + snum + " = " + a );
		System.out.println( fnum + " - " + snum +  " = " + s );
		System.out.println( fnum + " * " + snum + " = " + m );
		System.out.println( fnum + " / " + snum + " = " + d );
		System.out.println( fnum + " mod " + snum + " = " + md );
    }


}