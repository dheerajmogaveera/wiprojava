import java.io.*;
class Exercise2{
    public static void main(String[] args)throws IOException {
        String s1,s2;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the two Strings");
        s1=br.readLine();
        s2=br.readLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.charAt(s1.length()-1)==s2.charAt(0))
        {
            s1=s1+s2.substring(1);
            System.out.println(s1);
        }
        else{
              s1=s1+" "+s2;
            System.out.println(s1);
        }
}
}