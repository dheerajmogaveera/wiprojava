package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle
{
    String ModelName,RegistrationNumber,OwnerName;
    int speed;

    public Honda(String ModelName, String RegistrationNumber, String OwnerName, int speed) {
        this.ModelName = ModelName;
        this.RegistrationNumber = RegistrationNumber;
        this.OwnerName = OwnerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return ModelName;
    }

    @Override
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    @Override
    public String getOwnerName() {
        return OwnerName;
    }

    public int getSpeed() {
        return speed;
    }
    public void cdplayer()
    {
        System.out.println("Acessing Cd Player");
    }
}
