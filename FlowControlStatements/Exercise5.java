import java.util.Scanner;
class Exercise5{
public static void main(String args[])
{
char c;
int a;
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
a=c;
if(a>=48 && a<=57)
System.out.println("Digit");
else if(a>=65 && a<=90 || a>=97 && a<=122)
System.out.println("Alphabet");
else
System.out.println("Special Character");

}
}