import java.util.Scanner;
class Exercise7{
public static void main(String args[])
{
  char c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Alphabet");
  c=sc.next().charAt(0);
  if(Character.isUpperCase(c))
   System.out.println(c+"->"+Character.toLowerCase(c));
  else
   System.out.println(c+"->"+Character.toUpperCase(c));

}
}