package org;

public class Cub {
    private int length;
    private int width;
    private int height;

    public Cub(int length, int width, int height ){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void volume(){
        System.out.println("Cub volume is "+ length * width * height  +" sm ");
    }

}


