package com.assignments.Exercise3;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
class Exercise3{
    
    public static void main(String[] args) {
        Hero hero=new Hero("HR2020XS","Mh2k3535","Abc", 120);
        System.out.println("ModelName:"+hero.getModelName()+" RegistrationNumber"+hero.getRegistrationNumber()+" OwnerName:"+hero.getOwnerName()+" Speed:"+hero.getSpeed());
        hero.radio();
        Honda honda=new Honda("HON2020XS","Mh2Mk535","Def", 135);
        System.out.println("ModelName:"+honda.getModelName()+" RegistrationNumber"+honda.getRegistrationNumber()+" OwnerName:"+honda.getOwnerName()+" Speed:"+honda.getSpeed());
        honda.cdplayer();
        
    }
    
}