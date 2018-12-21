//         COSC 1337.S01
//         Lab 7
//         2015/4/30
//         ShapeTest.java
//---------------------------------------------------------------
public class ShapeTest {
    public static void main (String args[]){
    Shape s1 = new Shape();
    s1.draw();
    s1.move();
    s1.erase();
    Rectangle r1 = new Rectangle();
    r1.draw();
    r1.move();
    r1.erase();
    Square sq1 = new Square();
    sq1.draw();
    sq1.move();
    sq1.erase();
    Ellipse e1 = new Ellipse();
    e1.draw();
    e1.move();
    e1.erase();
    Circle c1 = new Circle();
    c1.draw();
    c1.move();
    c1.erase();
    Triangle t1 = new Triangle();
    t1.draw();
    t1.move();
    t1.erase();
    }
}