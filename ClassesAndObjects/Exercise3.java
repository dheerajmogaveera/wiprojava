class Patient {
     String patientName;
     double height,weight,width;

    public Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }
    double computeBMI()
    {
        return weight/Math.pow(height,height);
    }
     
}
class Exercise3
{
    public static void main(String[] args) {
        
      Patient p=new Patient("patient1",6.1,83);
        System.out.println("BMI of "+p.patientName+" is "+p.computeBMI());
        
    }
}
