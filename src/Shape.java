import java.awt.*;

public class Shape implements Moveable {
    private Point center;
    private int lineWidth; //Epaisseur du trait en pixels
    private Color lineColor; //Couleur du trait.

    public Shape(Point center, int lineWidth, Color lineColor) {
        setCenter(center);
        setLineColor(lineColor);
        setLineWidth(lineWidth);
    }

    public Point getCenter () {
        return this.center;
    }
    public void setCenter (Point center) {
        this.center=center;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void print() {
        System.out.println("Shape-center : "+center.toString());
    }
    
    
    public static void printShapes(Shape[]shapes){
        for (Shape shape:shapes) {
            shape.print();
        }
    }
    public static void drawShapes(Shape[]shapes, Paint paint){
        for (Shape shape:shapes) {
            shape.draw(paint);
        }
    }

    public void draw(Paint paint) {

    }

    @Override
    public void moveTo(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }
}
