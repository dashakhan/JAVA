package org;

public class Car {


    public static void overloading(int time, int km){
        System.out.println("An average car speed is " + (km / time) + " km per hour for integers");
    }

    public static void overloading(double time, double km){
        System.out.println("An average car speed is " + (km / time )+ " km per hour for decimals");
    }
}

