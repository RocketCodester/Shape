//         COSC 1337.S01
//         Lab 7
//         2015/4/30
//         Square.java
//---------------------------------------------------------------
public class Square extends Rectangle {
    public Square(){
        System.out.println("Square - default constructor");
    }
    @Override
    public void draw(){
        System.out.println("Square - draw method");
    }
    @Override
    public void move(){
        System.out.println("Square - move method");
    }
    @Override
    public void erase(){
        System.out.println("Square - erase method");
    }
}