package com.automobile.FourWheeler;
import  com.automobile.Vehicle;
public class Ford extends Vehicle{
     String ModelName,RegistrationNumber,OwnerName;
     int speed,tempControl;

    public Ford(String ModelName, String RegistrationNumber, String OwnerName, int speed, int tempControl) {
        this.ModelName = ModelName;
        this.RegistrationNumber = RegistrationNumber;
        this.OwnerName = OwnerName;
        this.speed = speed;
        this.tempControl = tempControl;
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

    public int speed() {
        return speed;
    }

    public int tempControl() {
        return tempControl;
    }
     
}
