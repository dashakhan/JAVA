package org;

public class Family {

    public static void overloading(int savings, int remainder){
        System.out.println("Family have spent " + (savings - remainder )+ " on that expensive vacation - for integers ");

    }

    public static void overloading(double savings, double remainder){
        System.out.println("Family have spent " + (savings - remainder )+ " on that expensive vacation - for decimals ");

    }


    public static void overloading(int momSalary, int dadSalary, int sale){
        System.out.println("This month family earnings are " + (momSalary + dadSalary + sale) + " for integers");
    }

    public static void overloading(double momSalary, double dadSalary, double sale){
        System.out.println("This month family earnings are " + (momSalary + dadSalary + sale )+ " for decimals");
    }
}




