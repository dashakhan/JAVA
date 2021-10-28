package org;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void perimeter(){

        double p = side1 + side2 + side3;
        System.out.println("Triangle perimeter is " + p +" sm");
    }
    public void area(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3);
        System.out.println("Triangle area is " + area +" sm");
    }

}


//В строке 20 вычисляю периметр  чтобы использовать полупериметр для формулы площади,
// могу ли я какти то способом задейстрововать метод на стоке 14 который уже вычисляет периметр?