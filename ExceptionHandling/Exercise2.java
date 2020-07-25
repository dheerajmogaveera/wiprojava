import java.io.*;

public class Exercise2{
    public static void main(String[] args)throws IOException {
        int n,a,element;
        int inputInteger;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the number of elements in the array");
        n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        try
        {
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the index of the array element you want to acess");
        a=Integer.parseInt(br.readLine());
        
            element=arr[a];
            System.out.println("the array element at index "+a+"="+element);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
