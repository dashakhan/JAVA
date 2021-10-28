package org;

public class Person {
    private double km;
    private double hour;

    public Person(double km, double hour){
        this.km = km;
        this.hour = hour;
    }
    public void speed(){
        System.out.println("An average person speed is " + km / hour + " kilometers an hour");
    }


}
