import java.io.*;

public class Exercise1{
    public static void main(String[] args)throws IOException {
        String input;
        int inputInteger;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.print("Enter value");
        input=br.readLine();
        try
        {
            inputInteger=Integer.parseInt(input);
            System.out.println("The square value is "+(inputInteger*inputInteger));
            System.out.println("The work has been done successfully");
        }
        catch(Exception e)
        {
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
