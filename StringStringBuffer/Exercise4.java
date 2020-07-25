import java.io.*;
class Exercise4{
    public static void main(String[] args)throws IOException {
        String InputString,OutputString;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        InputString=br.readLine();
        if(InputString.length()%2==0)
        {
           OutputString=InputString.substring(0, InputString.length()/2);
            System.out.println(OutputString);
        }
        else{
            OutputString="null";
            System.out.println(OutputString);
        }
}
}