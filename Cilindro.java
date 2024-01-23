public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = (altura < 0) ? 0 : altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getVolumen() {
        double areaCirculo = super.getArea();
        return areaCirculo * altura;
    }
}

