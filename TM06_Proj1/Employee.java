import java.io.Serializable;


class Employee implements Serializable{
    String name,designation;
    int age,id;
    double salary;
   
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public double getSalary() {
        return salary;
    }
     
    
    public void setName(String name) {
        this.name = name;
    }
  

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
	public String toString() {
		return id + " " + name + " "+designation+" "+ age + " " + salary;
	}
   
}