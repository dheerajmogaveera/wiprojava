import java.io.*;
public class Exercise4{
    public static void main(String[] args){
        int n,a,element,sum=0;
        int inputInteger;
        int arr[]=new int[5];
        try
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=Integer.parseInt(args[i]);
            }
            for(int i:arr)
            {
                sum=sum+i;
            }
            System.out.println("sum:"+sum);
            System.out.println("average:"+(sum/arr.length));
              
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae);
            
        }
        catch(NumberFormatException ne)
        {
            System.out.println(ne);
        }
        catch(ArithmeticException aee)
        {
            System.out.println(aee);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
