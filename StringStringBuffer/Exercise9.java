import java.io.*;
class Exercise9{
    public static void main(String[] args)throws IOException {
        String a,b,outputString="";
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the two Strings");
        a=br.readLine();
        b=br.readLine();
        if(a.length()<b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                outputString=outputString+a.charAt(i)+b.charAt(i);
            }
            outputString=outputString+b.substring(a.length(),b.length());
        }
        else if(b.length()<a.length())
        {
            for(int i=0;i<b.length();i++)
            {
                outputString=outputString+a.charAt(i)+b.charAt(i);
            }
            outputString=outputString+a.substring(b.length(),a.length());
        }
        else{
            for(int i=0;i<a.length();i++)
            {
                outputString=outputString+a.charAt(i)+b.charAt(i);
            }
        }
        System.out.println(outputString);
    
}
}