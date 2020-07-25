import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MainClass{
    public static void main(String[] args) {
        try{
            int choice=0;
            String filename = "EmployeeData.txt";
		
	    FileOutputStream f = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(f);

	    FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(in);
            
            while(choice!=3)
            {
             System.out.println("Main Menu");
	     System.out.println("1. Add an Employee");
	     System.out.println("2. Display All");
	     System.out.println("3. Exit");
            
             choice=Integer.parseInt(br.readLine());
             switch(choice)
             {
                 case 1:
                      Employee emp=new Employee();
                      System.out.println("Enter id");
                      emp.setId(Integer.parseInt(br.readLine()));
                      System.out.println("Enter name");
                      emp.setName(br.readLine());
                      System.out.println("Enter Designation");
                      emp.setDesignation(br.readLine());
                      System.out.println("Enter age");
                      emp.setAge(Integer.parseInt(br.readLine()));
                      System.out.println("Enter salary");
                      emp.setSalary(Double.parseDouble(br.readLine()));
                      out.writeObject(emp);
                      break;
                 case 2:
                     emp=null;
                     System.out.println("----Report-----");
                     while(fis.available()>0)
                     {   
                         emp=(Employee)ois.readObject();
                         System.out.println(emp);
                     }
                    System.out.println("----End of Report-----");
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    break;
                default:
                    System.out.println("Invalid Choice");
                     
             }
            
            
            }
	   
            f.close();
            out.close();
            fis.close();
            ois.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}