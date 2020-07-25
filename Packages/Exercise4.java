import com.automobile.FourWheeler.Logan;
import com.automobile.FourWheeler.Ford;
class Exercise4{
    
    public static void main(String[] args) {
        Logan logan=new Logan("LO2020XS","Mh2k3535","Abc",240,1);
        System.out.println("ModelName:"+logan.getModelName()+" RegistrationNumber"+logan.getRegistrationNumber()+" OwnerName:"+logan.getOwnerName()+" Speed:"+logan.speed());
        if(logan.gps()==1)
            System.out.println("Gps Facility available");
        else
            System.out.println("Gps facility not available");
        Ford ford=new Ford("FO2020XS","Mh2Mk535","Def",260,1);
        System.out.println("ModelName:"+ford.getModelName()+" RegistrationNumber"+ford.getRegistrationNumber()+" OwnerName:"+ford.getOwnerName()+" Speed:"+ford.speed());
        if(ford.tempControl()==1)
            System.out.println("Has Temperature Control/AC");
        else
            System.out.println("Does Not have Temperature Control/AC");
        
    }
    
}