import java.io.*;
class Exercise5{
    public static void main(String[] args)throws IOException {
        String InputString,OutputString;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        InputString=br.readLine();
       OutputString=InputString.substring(1,InputString.length()-1);
        System.out.println(OutputString);
}
}