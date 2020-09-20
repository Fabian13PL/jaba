package com.devices;

import com.company.salleable;

public abstract class Devices implements salleable {
     String model;
     String producer;
     int yearOfProduction;

     public String toString(){
         return model+" "+producer+" "+yearOfProduction;
     }

     abstract void turnOn();

}
