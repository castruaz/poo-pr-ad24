package p104_PuntoCirculo;

public class Punto {
    private int X;
    private int Y;

    public Punto() {
    }
    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public double getDistancia(Punto otro) {
        return (double) Math.sqrt(Math.pow((otro.X - this.X), 2.0) + Math.pow((otro.Y - this.Y), 2.0));
    }
    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}
