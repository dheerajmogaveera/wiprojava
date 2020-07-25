
import java.io.*;

   
class Exercise9{
 
    public static void main(String[] args)throws IOException {
        int a,b;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter the 2 numbers");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
       try{
           System.out.println("The quotient of "+a+"/"+b+" is "+(a/b));
        }
        catch(Exception e)
        {   
            e=new Exception("DivideByZeroException caught");
            System.out.println(e.getMessage());
        }
        finally{
           System.out.println("Inside finally block");
       }
        
    }
}