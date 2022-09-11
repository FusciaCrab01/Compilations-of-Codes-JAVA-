/**
 * @(#)Practice.java
 *
 *
 * @author
 * @version 1.00 2019/8/20
 */

import java.util.Scanner;

public class Practice
{
	public static void main(String args[])
	{
		//declaration of variables
		String sname, cdesc="", ses="";
		int scode, ccode, pdisc=0;
		double cfee=6000.00, rfee, damt, tbal;

		//input
		System.out.print("\n");
		Scanner in = new Scanner (System.in);
		System.out.print("Student Name :");
		sname=in.nextLine();
		System.out.print("Session Code (1-2) :");
		scode=in.nextInt();
		if (scode==1) ses="morning";
		if (scode==2) ses="afternoon";
		System.out.print("Course Code (50-52) :");
		ccode=in.nextInt();
		if (ccode==50) cdesc="C++";
		if (ccode==51) cdesc="Java";
		if (ccode==52) cdesc="Phyton";
		System.out.print("Registration Fee :");
		rfee=in.nextFloat();
		if (rfee<3000) pdisc=0;
		if (rfee>=3000) pdisc=5;

		//computation
		damt=cfee*pdisc/100;
		tbal=cfee-(rfee+damt);

		//display

		System.out.printf("\n\n\n");
		System.out.printf("Student Name : %S\n", sname);
		System.out.printf("Session      : %S\n", ses);
		System.out.printf("Course Code  : %S\n", cdesc);
		System.out.printf("Total Amount : %7.2f\n", tbal);
	}
}