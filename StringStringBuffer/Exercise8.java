import java.io.*;
class Exercise8{
    public static void main(String[] args)throws IOException {
        String InputString,OutputString="";
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        InputString=br.readLine();
        OutputString=InputString;
        while(OutputString.contains("*"))
        {
           int i=InputString.indexOf("*");
           if(i==0)
           OutputString=OutputString.replace(OutputString.substring(i,i+2),"");
           else if(i==OutputString.length()-1)
           OutputString=OutputString.substring(0,i-2);
           else
           {
           
               
            }
           
        }
        System.out.println(OutputString);
        
    
}
}