package org;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width= width;
    }
    public void area(){
        System.out.println("Rectangle area is "+ length * width + " square sm");
    }
    public void perimeter(){
        System.out.println("Rectangle perimeter is " + (length + width) * 2 + " sm");
    }

}

