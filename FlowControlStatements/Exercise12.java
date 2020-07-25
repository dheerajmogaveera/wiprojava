import java.util.Scanner;
class Exercise12{
public static void main(String args[])
{
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
for(int i=2;i<=n/2;i++)
     if(n%i==0)
     {
      flag=true;
      break;
       }
if(flag)
  System.out.println(n+" is not a prime number");
else
  System.out.println(n+" is a prime number");      

}
}

