class TestEmployee{
    public static void main(String[] args) {
        Employee e=new Employee(30000,"2019","SK2343545" );
        e.setName("Abhijeet");
        System.out.println("Employee Name   Salary  YearOfJoining   National Insurance Number");
        System.out.println(e.getName()+"    "+e.getAnnualSalary()+"     "+e.getYearOfJoining()+"          "+e.getNationalInsuranceNumber());
    }
}