import java.util.Scanner;
class Exercise8{
public static void main(String args[])
{
  char c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Color Code");
  c=sc.next().charAt(0);
  switch(c)
     {
       case 'R':
         System.out.println("Red");
         break;
       case 'B':
         System.out.println("Blue");
         break;
       case 'G':
          System.out.print("Green");
          break;
       case 'O':
          System.out.println("Orange");
          break;
       case 'Y':
          System.out.println("Yellow");
          break;
       case 'W':
          System.out.println("White");
          break;
      default:
          System.out.println("Invalid Code");
          break;

        }

}
}