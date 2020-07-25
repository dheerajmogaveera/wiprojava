import java.util.Scanner;
class Exercise1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<0)
System.out.println("The Integer is Negative");
else if(n>0)
System.out.println("The Integer is Positive");
else
System.out.println("The Integer is Zero");
}
}

