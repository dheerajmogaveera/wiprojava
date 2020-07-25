import java.util.Scanner;
class Exercise14{
public static void main(String args[])
{
boolean flag=false;
int n=Integer.parseInt(args[0]);
if(n==0 || n==1)
System.out.println(n+" is neither nor composite");
else{
for(int i=1;i<=n/2;i++)
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

}

