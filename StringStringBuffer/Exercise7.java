import java.io.*;
class Exercise7{
    public static void main(String[] args)throws IOException {
        String InputString,OutputString="";
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        InputString=br.readLine();
        if(InputString.charAt(0)=='x' || InputString.charAt(InputString.length()-1)=='x')
        {
           OutputString=InputString.replaceAll("x","");
        }
        else
        {
            OutputString=InputString;
        }
            
       
        System.out.println(OutputString);
        
    
}
}