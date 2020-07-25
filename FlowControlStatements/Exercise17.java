import java.util.Scanner;
class Exercise17{
public static void main(String args[])
{
  int n,d,rev=0;
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter numeric value");
  n=sc.nextInt();
  while(n!=0)
   {
      d=n%10;
      rev=rev*10+d;
      n=n/10;
     }
   System.out.println(rev);

}

}

