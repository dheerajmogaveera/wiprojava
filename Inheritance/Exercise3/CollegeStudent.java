public class CollegeStudent extends Student{
    
    String CollegeName,Year;

    public CollegeStudent(String CollegeName, String Year) {
        this.CollegeName = CollegeName;
        this.Year = Year;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    

    public String getCollegeName() {
        return CollegeName;
    }

    public String getYear() {
        return Year;
    }

    @Override
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
    
    

