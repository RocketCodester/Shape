//         COSC 1337.S01
//         Lab 7
//         2015/4/30
//         Rectangle.java
//---------------------------------------------------------------
public class Rectangle extends Shape {
    public Rectangle(){
        System.out.println("Rectangle - default constructor");
    }
    @Override
    public void draw(){
        System.out.println("Rectangle - draw method");
    }
    @Override
    public void move(){
        System.out.println("Rectangle - move method");
    }
    @Override
    public void erase(){
        System.out.println("Rectangle - erase method");
    }
}