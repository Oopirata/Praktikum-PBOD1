/*
File    : Vehicle.java
Nama    : Hanif Herofa
NIM     : 24060122120015
 */

package Minggu_10;

public abstract class Vehicle {

    public abstract  double calcFuelEfficiency();

    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
    
}