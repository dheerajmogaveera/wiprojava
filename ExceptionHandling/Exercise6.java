import java.io.*;

class Student{
    String name;
    int sub1,sub2,sub3;
}
 
class NegativeValueException extends Exception{

    public NegativeValueException(String message) {
        super(message);
    }
    
}
class MarksOutOfRangeException extends Exception{

    public MarksOutOfRangeException(String message) {
        super(message);
    }
    
}
public class Exercise6{
    
    static int AverageMarks(Student s1,Student s2)throws ArithmeticException
    {
        return (s1.sub1+s1.sub2+s1.sub3+s2.sub1+s2.sub2+s2.sub3)/2;
    }
    public static void main(String[] args)throws IOException {
        
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        Student s1=new Student();
        Student s2=new Student();
        try{
            System.out.println("Enter First Student's name");
            s1.name=br.readLine();
            System.out.println("Enter First Student's marks in three subjects");
            System.out.println("sub1:");
            s1.sub1=Integer.parseInt(br.readLine());
            System.out.println("sub2:");
            s1.sub2=Integer.parseInt(br.readLine());
            System.out.println("sub3:");
            s1.sub3=Integer.parseInt(br.readLine());
            System.out.println("Enter Second Student's name");
            s2.name=br.readLine();
            System.out.println("Enter Second Student's marks in three subjects");
            System.out.println("sub1:");
            s2.sub1=Integer.parseInt(br.readLine());
            System.out.println("sub2:");
            s2.sub2=Integer.parseInt(br.readLine());
            System.out.println("sub3:");
            s2.sub3=Integer.parseInt(br.readLine());
            if(s1.sub1<0 || s1.sub2<0 || s1.sub3<0 || s2.sub1<0 || s2.sub2<0 || s2.sub3<0)
                throw new NegativeValueException("Negative marks entered,marks cannot be negative");
            if(s1.sub1>100 || s1.sub2>100 || s1.sub3>100 || s2.sub1>100 || s2.sub2>100 || s2.sub3>100)
                throw new MarksOutOfRangeException("Marks can only be in the range of 0 to 100");
             
            System.out.println("Average marks of "+s1.name+" and "+s2.name+" is "+AverageMarks(s1, s2));
        
        
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      
       
    }
}
