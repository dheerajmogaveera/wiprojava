import java.io.*;

public class Exercise5{
    
    static int division(int a,int b)throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String[] args)throws IOException {
        int a,b;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        try{
            System.out.println("Enter the dividend");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter the divisor");
            b=Integer.parseInt(br.readLine());
            System.out.println(division(a, b));
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      
       
    }
}
