import java.util.Scanner;
class Exercise6{
public static void main(String args[])
{
  int age=Integer.parseInt(args[1]);
  if(args[0].equals("Female"))
    {
          if(age>=1 && age<=58)
               System.out.println("The percentage of interest is 8.2%");
          else if(age>=59 && age<=100)
                System.out.println("The percentage of interest is 9.2%");
          else
                System.out.println("The max age limit is 100");
          
          }
  else
    {
        if(age>=1 && age<=58)
               System.out.println("The percentage of interest is 8.4%");
          else if(age>=59 && age<=100)
                System.out.println("The percentage of interest is 10.5%");
          else
                System.out.println("The max age limit is 100");

          }

}
}