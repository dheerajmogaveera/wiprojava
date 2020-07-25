import java.io.*;
class Exercise15{
public static void main(String args[])throws IOException
{
  int sum=0;
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  System.out.println("Enter numeric value");
  String value=br.readLine();
  for(int i=0;i<value.length();i++)
    sum=sum+Character.getNumericValue(value.charAt(i));
  System.out.println(sum);

}

}

