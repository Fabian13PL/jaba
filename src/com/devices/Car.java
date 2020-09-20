package com.devices;

import com.company.Human;

public class Car extends Devices{
    private Double value;

    public Double getValue(){
        return value;
    }
    public void setValue(Double value){
        this.value=value;
    }
    public String toString(){
        return model+" "+producer+" "+value;
    }

    @Override
    void turnOn() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
