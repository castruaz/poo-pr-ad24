package p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;
    public Circulo() {
    }
    public Circulo(Punto centro, double radio) {
        Centro = centro;
        Radio = radio;
    }
    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        return Math.pow(Radio, 2) * Math.PI;
    }
    public double getCircunferencia(){
        return Radio * 2 * Math.PI;
    }
    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
}
