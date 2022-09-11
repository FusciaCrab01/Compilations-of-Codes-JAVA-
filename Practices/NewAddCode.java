import java.util.*;

public class NewAddCode {

    public static void main (String args[])
    {
    	if(DBookC.length > 0)
		{
		double [] newPrice = new double [DPrice.length +1];
		String [] newAuthor = new String [DAuthor.length +1];
		String [] newTittle = new String [DTittle.length +1];
		int [] newBookC = new int [DBookC.length +1];

			for(int i=0; i<DPrice.length; i++)
			{
				newPrice[i] = DPrice[i];
				newTittle[i] = DTittle[i];
				newAuthor[i] = DAuthor[i];
				newBookC[i] = DBookC[i];
			}
			newPrice[newPrice.length - 1] = price;
			newAuthor[newAuthor.length - 1] = author;
			newTittle[newTittle.length - 1] = tittle;
			newBookC[newBookC.length - 1] = bookc;

			DPrice = newPrice;
    		DTittle = newTittle;
    		DAuthor = newAuthor;
    		DBookC  = newBookC;
		}
		else
		{
		double [] newPrice = new double [1];
		String [] newAuthor = new String [1];
		String [] newTittle = new String [1];
		int [] newBookC = new int [1];

		for(int i=0; i<1; i++)
			{
				newPrice[i] = price;
				newTittle[i] = tittle;
				newAuthor[i] = author;
				newBookC[i] = bookc;
			}

			DPrice = newPrice;
    		DTittle = newTittle;
    		DAuthor = newAuthor;
    		DBookC  = newBookC;

		}

    }


}