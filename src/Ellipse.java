//         COSC 1337.S01
//         Lab 7
//         2015/4/30
//         Ellipse.java
//---------------------------------------------------------------
public class Ellipse extends Shape {
    public Ellipse(){
        System.out.println("Ellipse - default constructor");
    }
    @Override
    public void draw(){
        System.out.println("Ellipse - draw method");
    }
    @Override
    public void move(){
        System.out.println("Ellipse - move method");
    }
    @Override
    public void erase(){
        System.out.println("Ellipse - erase method");
    }
}