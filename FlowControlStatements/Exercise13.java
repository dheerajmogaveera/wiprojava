import java.util.Scanner;
class Exercise13{
public static void main(String args[])
{
boolean flag;
Scanner sc=new Scanner(System.in);
for (int k=10;k<=99;k++)
{ flag=false;
for(int i=2;i<=k/2;i++)
  {
     if(k%i==0)
     {
      flag=true;
      break;
       }
    }
if(flag)
 System.out.println(k+" is not a prime number");
else
 System.out.println(k+" is a prime number");

}
}
}

