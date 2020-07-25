import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Exercise1{
    public static void main(String[] args) {
        try{
            Date d=new Date();
            String s="17/8/1997"; 
            DateFormat df=new SimpleDateFormat("dd/mm/yy");
            d=df.parse(s);
            Employee emp=new Employee();
            emp.setName("Abc");
            emp.setDateOfBirth(d);
            emp.setDepartment("Development");
            emp.setDesignation("Designation");
            emp.setSalary(40000);
            FileOutputStream f=new FileOutputStream("data.txt");
            ObjectOutputStream out=new ObjectOutputStream(f);
            out.writeObject(emp);
            FileInputStream fis = new FileInputStream("data.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDateOfBirth());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		
		fis.close();
		ois.close();
		
            out.close();
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}