package com.davegreen;

/**
 * Created by daveg on 16/06/2017.
 */
public class Car extends Vehicle
{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity)
    {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
