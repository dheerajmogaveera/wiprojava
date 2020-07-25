
class Employee implements Cloneable{
    String name,gender;
    int id;
    double salary;

    public Employee(String name, String gender, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.salary = salary;
    }
   
    
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public Employee clone()
    {
        try{
            return (Employee)super.clone();
        }
        catch(CloneNotSupportedException c)
        {
            System.out.println("Cloning not allowed");
            return this;
        }
    }
    
}
class Exercise4{
    public static void main(String[] args){
        Employee e=new Employee("Abc", "Male",105,32000);
        Employee e1=(Employee)e.clone();
        e1.setSalary(40000);
        e1.setName("DEF");
        System.out.println("Original Class Details");
        System.out.println("Name:"+e.getName()+" id:"+e.getId()+" Gender:"+e.gender+" Salary:"+e.getSalary());
        System.out.println("Cloned Class Details");
        System.out.println("Name:"+e1.getName()+" id:"+e1.getId()+" Gender:"+e1.gender+" Salary:"+e1.getSalary());
    }
}