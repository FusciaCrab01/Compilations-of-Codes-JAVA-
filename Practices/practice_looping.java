
public class practice_looping{
	public static void main (String args[])
	{
//		int sum = 0;
//
//		for(int i = 1; i<4; i++)
//			for(int j = 1; j<4; j++)
//				sum=i+j;
//			System.out.println(sum);

		String college = "";

		do
		{
			if (college.equals(""))
				college += "Williams";
			else if(college.equals("Williams"))
				college += " and
					";
			else if(college.equals("Williams and "))
				college +="Mary";
			else
				break;
		}while(true);
		System.out.print(college);
	}
}

