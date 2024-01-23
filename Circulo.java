public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = (radio < 0) ? 0 : radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }
}

