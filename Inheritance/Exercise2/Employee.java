public class Employee extends Person{
    
 double annualSalary;
 String yearOfJoining,NationalInsuranceNumber;

    public Employee(double annualSalary, String yearOfJoining, String NationalInsuranceNumber) {
        this.annualSalary = annualSalary;
        this.yearOfJoining = yearOfJoining;
        this.NationalInsuranceNumber = NationalInsuranceNumber;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearOfJoining(String yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setNationalInsuranceNumber(String NationalInsuranceNumber) {
        this.NationalInsuranceNumber = NationalInsuranceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getYearOfJoining() {
        return yearOfJoining;
    }

    public String getNationalInsuranceNumber() {
        return NationalInsuranceNumber;
    }

    public String getName() {
        return name;
    }
 
 
}