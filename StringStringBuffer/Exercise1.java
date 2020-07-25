import java.io.*;
class Exercise1{
    public static void main(String[] args)throws IOException {
        
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter String");
        String s=br.readLine();
        s=s.toLowerCase();
        StringBuffer sb=new StringBuffer(s);
        StringBuffer rev=new StringBuffer(s);
        String s2=rev.reverse().toString(); 
        
        if(s.equals(s2))
        {
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
        
}
}