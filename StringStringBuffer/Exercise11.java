import java.io.*;
class Exercise11{
    public static void main(String[] args)throws IOException {
        String a,b,outputString="";
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the values of the two Strings");
        a=br.readLine();
        b=br.readLine();
        while(a.contains(b))
        {
           
           int i=a.indexOf(b.charAt(0));
           if(i==0)
           {
               outputString=outputString+a.charAt(i+b.length());
               a=a.replaceFirst(b,"");
           }
           else if(i==a.length()-b.length())
           {
               outputString=outputString+a.charAt(i-1);
               a=a.replaceFirst(b,"");
           }  
           else
               {
               outputString=outputString+a.charAt(i-1)+a.charAt(i+b.length());
                a=a.replaceFirst(b,"");
               }  
        }
        System.out.println(outputString);
    
}
}