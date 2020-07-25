import java.io.*;
class Exercise10{
    public static void main(String[] args)throws IOException {
        String inputString,outputString="";
        int n;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.print("Enter the values of String and n");
        inputString=br.readLine();
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            outputString=outputString+inputString.substring(inputString.length()-n,inputString.length());
        }
       
        System.out.println(outputString);
    
}
}