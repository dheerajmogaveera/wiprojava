import java.util.Scanner;
class Exercise4{
public static void main(String args[])
{
char c1,c2;
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two char values");
c1=sc.next().charAt(0);
c2=sc.next().charAt(0);
a=c1;
b=c2;
if(b>a)
{ 
  System.out.println(c1+","+c2);

  }
else
{
   System.out.println(c2+","+c1);
  }

}
}