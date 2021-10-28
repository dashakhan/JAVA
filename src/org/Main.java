package org;

public class Main {

    public static void main(String[] args) {
	Cub cub1 = new Cub(2, 2, 2);
    cub1.volume();

    Rectangle rectangle1 = new Rectangle(3, 4);
    rectangle1.area();
    rectangle1.perimeter();

    Triangle triangle1 = new Triangle(5.0, 5.0, 5.0);
     triangle1.area();
     triangle1.perimeter();

    Person person1 = new Person(5.5, 2.5);
    person1.speed();

    Square square1 = new Square();
    square1.overloading(2);
    square1.overloading(3.5);

    Car miniCar = new Car();
    miniCar.overloading(1,6);
    miniCar.overloading(1.30, 1.30);

    Family homyachkov = new Family();
    homyachkov.overloading(5000, 5);
    homyachkov.overloading(6789.50, 0.50);
    homyachkov.overloading(300,300,0);
    homyachkov.overloading(333.33, 555.55, 7.99);

    //  почему методы с дробными на строках 14 и 32 как то странно складывает остаток

    }
}

