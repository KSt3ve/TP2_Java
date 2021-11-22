import java.awt.*;

public class Main {

    public static void testPoint(){
//        Point p = new Point(100, 200);
//        System.out.println(p.getX());
//        p.setX(300);
//        System.out.println(p.getX());

//        Point p = new Point(100, 200);System.out.println(p);
        Point p = new Point(100, 200);
        String s = "Point coordinates : " + p;
        System.out.println(s);
    }

//    public static void testShape(){
//        Point center = new Point(100, 200);
//        Shape s = new Shape(center);
//        s.print();
//    }

//    public static void testCircle(){
//        Shape c= new Circle(new Point(100, 200), 50);
//        c.print();
//    }

//    public static void testPaint() {
//        Paint p = new Paint(200, 200);
//        Circle c = new Circle(new Point(100, 100), 100);
//        Rectangle r = new Rectangle(new Point(100, 100), 173, 100);
//        Shape[] shapes = new Shape[2];
//        shapes[0] = c;
//        shapes[1] = r;
//        Shape.drawShapes(shapes, p);
//    }

    public static void testColor() {
        Paint p = new Paint(500, 500);
        Circle c = new Circle(new Point(100, 100), 100, Color.RED, 5);
        c.draw(p);
        Rectangle r = new Rectangle(new Point(100, 100), 173, 100, Color.BLUE, 2);
        r.moveTo(200,200);
        r.draw(p);
    }

    public static void main(String[] args) {
        testColor();
    }
}