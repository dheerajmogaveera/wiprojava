public class Teacher extends Person{
    
 double Salary;
 String Subject;

    public Teacher(double Salary, String Subject) {
        this.Salary = Salary;
        this.Subject = Subject;
    }
 

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

 @Override
    public void setName(String name) {
        this.name = name;
    }

 @Override
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

   
    public double getSalary() {
        return Salary;
    }

    public String getSubject() {
        return Subject;
    }

 @Override
    public String getName() {
        return name;
    }

 @Override
    public String getDateOfBirth() {
        return DateOfBirth;
    }
}

