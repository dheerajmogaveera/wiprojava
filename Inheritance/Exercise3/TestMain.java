class TestMain{
    public static void main(String[] args) {
        
        Person p=new Person();
        p.setName("Abc");
        p.setDateOfBirth("06-07-1997");
        Teacher t=new Teacher(20000, "English");
        t.setName("Akanksha");
        t.setDateOfBirth("27-09-1998");
        Student s=new Student();
        s.setStudentId(14);
        s.setName("Chinmay");
        s.setDateOfBirth("03-07-1998");
        CollegeStudent cs=new CollegeStudent("Thadomal", "Fourth");
        cs.setStudentId(21);
        cs.setName("Rhea");
        cs.setDateOfBirth("17-11-1998");
        System.out.println("Person class Details:");
        System.out.println("Name:"+p.getName()+"  DOB:"+p.getDateOfBirth());
        System.out.println("Teacher class Details:");
        System.out.println("Name:"+t.getName()+" Subject:"+t.getSubject()+" Salary:"+t.getSalary()+" DOB:"+t.getDateOfBirth());
        System.out.println("Student class Details:");
        System.out.println("Name:"+s.getName()+" Id:"+s.getStudentId()+" DOB:"+s.getDateOfBirth());
        System.out.println("CollegeStudent class details:");
        System.out.println("Name:"+cs.getName()+" CollegeName:"+cs.getCollegeName()+" Id:"+cs.getStudentId()+" Year:"+cs.getYear()+" DOB:"+cs.getDateOfBirth());
        
        
        
    }
}