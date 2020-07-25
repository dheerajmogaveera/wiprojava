import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;


public class Employee implements Serializable{
    String name,department,designation;
    Date dateOfBirth;
    double salary;
   
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }
     
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Employee [name=" + name + ", dob=" + dateOfBirth + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
        
    }
}