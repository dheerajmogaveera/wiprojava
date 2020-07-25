import java.io.*;
class Exercise3{
    public static void main(String[] args)throws IOException {
        String InputString,OutputString="";
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        InputString=br.readLine();
        for(int i=0;i<InputString.length();i++)
        {
            OutputString=OutputString+InputString.substring(0,2);
        }
        System.out.println(OutputString);
}
}