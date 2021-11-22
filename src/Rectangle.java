import java.awt.*;

public class Rectangle extends Shape implements Moveable{
    private int width;
    private int height;
    public Rectangle(Point center, int width, int height, Color lineColor, int lineWidth){
        super(center,lineWidth,lineColor);
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print(){
        System.out.println("Rectangle -center : "+super.getCenter()+", width:"+this.width+", height : "+this.height);
    }

    public void draw(Paint paint) {
        paint.setColor(this.getLineColor());
        paint.setLineWidth(this.getLineWidth());
        paint.drawLine(getCenter().getX() - width / 2, getCenter().getY() - height / 2, getCenter().getX() + width / 2, getCenter().getY() - height / 2);
        paint.drawLine(getCenter().getX() + width / 2, getCenter().getY() - height / 2, getCenter().getX() + width / 2, getCenter().getY() + height / 2);
        paint.drawLine(getCenter().getX() + width / 2, getCenter().getY() + height / 2, getCenter().getX() - width / 2, getCenter().getY() + height / 2);
        paint.drawLine(getCenter().getX() - width / 2, getCenter().getY() + height / 2, getCenter().getX() - width / 2, getCenter().getY() - height / 2);
    }

    @Override
    public void moveTo(int x, int y) {
        super.getCenter().setX(x);
        super.getCenter().setY(y);
    }
}
