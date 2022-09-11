import java.util.Scanner;

public class ElemRemoval
{
   public static void main(String args[])
   {
       int size, del, count=0;

       Scanner scan = new Scanner(System.in);

       
        int arr[] = {};

        Boolean condition = true;
        do{
            System.out.print("Enter the Price : ");
            int price = scan.nextInt();

            if(arr.length > 0)
            {
                int[] newPrice = new int [arr.length +1];
                

                for(int i=0; i<arr.length; i++)
                {
                    newPrice[i] = arr[i];
                   
                }
                newPrice[newPrice.length - 1] = price;
                

                arr = newPrice;
                
            }
            else
            {
               int [] newPrice = new int [1];
                
                for(int i=0; i<1; i++)
                    {
                        newPrice[i] = price;
                        
                    }

                arr = newPrice;
                
            }

            if(price == 0)
            {
                condition = false;
            }
        }while(condition);
            
        for(int i=0; i<(arr.length-1); i++)
       {
           System.out.print(arr[i]+ " ");
       }
                        
       System.out.print("Enter Element to be Delete : ");
       del = scan.nextInt();
       for(int x=0; x<arr.length; x++)
       {
           if(arr[x] == del)
           {
               for(int j=x; j<(arr.length-1); j++)
               {
                   arr[j] = arr[j+1];
               }
               count++;
               break;
           }
       }
       if(count==0)
       {
           System.out.print("Element Not Found..!!");
       }
       else
       {
           System.out.print("Element Deleted Successfully..!!");
           System.out.print("\nNow the New Array is :\n");
           System.out.print(arr.length);
           for(int i=0; i<(arr.length-1); i++)
           {
               System.out.print(arr[i]+ " ");
           }
       }
   }
}