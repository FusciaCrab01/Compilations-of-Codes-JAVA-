import java.util.*;


public class ExperimentInSales {

    public static void main (String args [])
   	{

		Scanner in = new Scanner (System.in);
		//declaration of all variables
		int day , month , year , ch , ch1;
		int bcode , scode , hdays = 0 , login = 0, quantity;
		double total=0 , bprice=0 , inter=0 , depo = 0 , change=0, cash=0;

		//declaration of all Array needed
		int Month[] = {11,11,11,11,11};
		int Day[] = {19,20,21,22,23};
		int Year[] = {2019,2019,2019,2019,2019};
		String SalesC[] = {"john","john","john","mark","john"};
		double SalesP[] = {1092.2,1029.3,1002.7,1242.2,3000.3};
		int SalesBC[] = {1111,1111,1112,1114,1113};

		String Cashier[] = {"jericho" ,"john","mark"};
		String CPass[] = {"sara","123456","128"};
		int BookC[]={0,1111,1112,1113,1114};
    	String Author[]={"","Cong Velasques","Junnie Dad","Pau Sepagan","Cong Velasques"};
        String Tittle[]={"","CongTv Book","Giyang na Giyang","RoggerRaker Tutorial","Billioners Mind"};
        double Price[]={0.00,450.00,350.60,420.30,520.00};
		System.out.println("Enter the Date Today");

	do{ System.out.print("Enter Month (MM)	: ");
		month = in.nextInt();
		}while(month < 1 || month > 12);

	do{ System.out.print("Enter Day (DD)    : ");
		day = in.nextInt();
		}while(day < 1 || day > 31);

	do{ System.out.print("Enter Year (YYYY) : ");
		year = in.nextInt();
		}while(year < 2017 || year >2021);

	int [] newDay = new int [Day.length +1];
	int [] newMonth = new int [Month.length +1];
	int [] newYear = new int [Year.length +1];

		for (int x = 0; x<Month.length; x++)
		{
			newMonth[x] = Month[x];
			newDay[x] = Day[x];
			newYear[x] = Year[x];
		}

		newDay[newDay.length - 1] = day;
		newMonth[newMonth.length - 1] = month;
		newYear[newYear.length - 1] = year;

		Day = newDay;
		Month = newMonth;
		Year = newYear;


		System.out.println("[1] Transaction\n[2] Exit");
		do {System.out.print("Enter your choice : ");
		ch = in.nextInt();} while(ch <1 || ch>2);

		if (ch == 1)
		{
		Scanner n = new Scanner(System.in);

		System.out.print("Cashier Name  :");
			String cashname = n.nextLine();
			System.out.print("Password      :");
			String cashpass = n.nextLine();

			for(int x = 0; x<Cashier.length; x++)
			{
				if(cashname.equals(Cashier[x]) && cashpass.equals(CPass[x]))
				{
					int index = 0;
					System.out.print("Book Code : ");
			        bcode = in.nextInt();
			        for (int a = 1; a<BookC.length; a++)
			        {
			        	if (bcode == BookC[a])
			        	{
						index = a;
			        	}
			        }

					System.out.print("Quantity  : ");
					quantity = in.nextInt();
					total = Price[index]*quantity;
			    	System.out.printf("Sub Total      :%7.2f\n",total);
			    	System.out.print("Enter the Cash : ");
					cash = in.nextInt();

			    	change = cash - total;



				   	//display part
					System.out.println("\n");
				   	System.out.println("\t\t\t\tAnti-Book Store\n");
				   	System.out.println("Name of Book      : "+Tittle[index]);
				   	System.out.println("Author of Book    : "+Author[index]);
				   	System.out.println("Book Price        : "+Price[index]);
			   		System.out.printf("Total Price       :%7.2f\n" ,total);
			   		System.out.printf("Cash              : %7.2f\n" ,cash);
			   		System.out.printf("Change            : %7.2f\n\n" , change);



					double [] newSalesP = new double [SalesP.length +1];
					String [] newSalesC = new String [SalesC.length +1];

					for (int y = 0; y<SalesC.length; y++)
					{
						newSalesC[y] = SalesC[y];
						newSalesP[y] = SalesP[y];
					}

					newSalesP[newSalesP.length - 1] = total;
					newSalesC[newSalesC.length - 1] = cashname;


					SalesP = newSalesP;
					SalesC = newSalesC;
				}
			}
		}

			if(ch == 2)
			{
				Scanner n = new Scanner(System.in);
				boolean condi = true;
				do{
				System.out.println("[1] Daily\n[2] Weekly\n[3] Monthly\n[4] Annual\n[5] Cashier\n[6] Exit");
				System.out.print("Enter your choice :");
				ch1 = in.nextInt();

				if (ch1 == 1)
				{
					System.out.print("Enter the Day [DD] :");
					int ser1  = n.nextInt();

					int sum = 0;
					for(int c = 0; c<Day.length; c++)
					{

						if(ser1 == Day[c])
						{

							System.out.println("Cashier Name\t\t\t\tSales per Transaction");
							System.out.println(SalesC[c]+"\t\t\t\t"+SalesP[c]);
							sum += SalesP[c];


						}
					}
					System.out.println("The Total of Daily Sales is " +sum);
				}
				if (ch1 == 2)
				{
					System.out.print("Enter the Day [DD] From :");
					int ser1  = n.nextInt();
					System.out.print("Enter the Day [DD] To :");
					int ser2  = n.nextInt();

					int sum = 0 , counter;
					System.out.println("Cashier Name\t\t\t\tSales per Transaction");
					for(int c = 0; c<Day.length; c++)
					{
						for (int v = ser1; v<=ser2; v++)
						{
							if(v == Day[c] )
							{
								System.out.println(SalesC[c]+"\t\t\t\t"+SalesP[c]);
								sum += SalesP[c];
							}
						}


					}
						System.out.println("The Total of Daily Sales is " +sum);
				}
				if (ch1 == 3)
				{
					System.out.print("Enter the Month [MM] :");
					int ser1  = n.nextInt();

					int sum = 0;
					System.out.println("Cashier Name\t\tSales per Transaction");
					for(int c = 0; c<Month.length; c++)
					{
						if(ser1 == Month[c] )
						{
							System.out.println(SalesC[c]+"\t\t\t\t"+SalesP[c]);
							sum += SalesP[c];
						}
					}
						System.out.println("The Total of Daily Sales is " +sum);
				}
				if (ch1 == 4)
				{
					System.out.print("Enter the Year [YYYY] :");
					int ser1  = n.nextInt();

					int sum = 0;
					System.out.println("Cashier Name\t\tSales per Transaction");
					for(int c = 0; c<Year.length; c++)
					{
						if(ser1 == Year[c] )
						{
							System.out.println(SalesC[c]+"\t\t\t\t"+SalesP[c]);
							sum += SalesP[c];
						}
					}
						System.out.println("The Total of Daily Sales is " +sum);
				}
				if (ch1 == 5)
				{
					System.out.print("Enter the Cashier Name :");
					String ser1  = n.nextLine();

					int sum = 0;
					System.out.println("Cashier Name\t\tSales per Transaction");
					for(int c = 0; c<SalesC.length; c++)
					{
						if(ser1.equals(SalesC[c]) )
						{
							System.out.println(SalesC[c]+"\t\t\t\t"+SalesP[c]);
							sum += SalesP[c];
						}
					}
						System.out.println("The Total of Daily Sales is " +sum);
				}
				if (ch1 == 6);
				{
					System.exit(1);
				}

			}while(condi);

			}

		}

    }


