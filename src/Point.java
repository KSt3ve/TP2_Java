public class Point implements  Moveable {
    private int x; //Coordonnée du point suivant l’axe x, en pixels
    private int y; //Coordonnée du point suivant l’axe y, en pixels

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
