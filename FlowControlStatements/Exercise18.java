import java.util.Scanner;
class Exercise18{
public static void main(String args[])
{
  int n,d,rev=0,ncopy;
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter numeric value");
  n=sc.nextInt();
  ncopy=n;
  while(n!=0)
   {
      d=n%10;
      rev=rev*10+d;
      n=n/10;
     }
   if(ncopy==rev)
   System.out.println(ncopy+" is a palindrome number");
   else
   System.out.println(ncopy+" is a not palindrome number");

}

}

