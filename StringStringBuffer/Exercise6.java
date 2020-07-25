import java.io.*;
class Exercise6{
    public static void main(String[] args)throws IOException {
        String InputString1,InputString2,OutputString;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        InputString1=br.readLine();
        InputString2=br.readLine();
        if(InputString1.length()<InputString2.length())
        {
       OutputString=InputString1+InputString2+InputString1;
        System.out.println(OutputString);
        }
        else
        {
             OutputString=InputString2+InputString1+InputString2;
        System.out.println(OutputString);
            
        }
}
}