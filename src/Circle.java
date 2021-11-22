import java.awt.*;

public class Circle extends Shape implements Moveable{
    private int radius;
    public Circle(Point center, int radius,Color lineColor, int lineWidth){
        super(center,lineWidth,lineColor);
        setRadius(radius);
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public void draw(Paint paint){
        paint.setColor(this.getLineColor());
        paint.setLineWidth(this.getLineWidth());
        paint.drawArc(getCenter().getX(),getCenter().getY(),2*radius,2*radius,0,360);
    }

    public void print(){
        System.out.println("Circle -center :"+super.getCenter()+", radius : "+this.radius);
    }

    @Override
    public void moveTo(int x, int y) {
        super.getCenter().setX(x);
        super.getCenter().setY(y);
    }
}
