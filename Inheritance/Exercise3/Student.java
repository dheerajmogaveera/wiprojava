public class Student extends Person{
    int StudentId;

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    

    public int getStudentId() {
        return StudentId;
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

 