package com.automobile.FourWheeler;
import  com.automobile.Vehicle;
public class Logan extends Vehicle{
    String ModelName,RegistrationNumber,OwnerName;
    int speed,gps;

    public Logan(String ModelName, String RegistrationNumber, String OwnerName, int speed, int gps) {
        this.ModelName = ModelName;
        this.RegistrationNumber = RegistrationNumber;
        this.OwnerName = OwnerName;
        this.speed = speed;
        this.gps = gps;
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

    public int gps() {
        return gps;
    }
    
}