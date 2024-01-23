public class main {
    public static void main(String[] args) {
        Circulo circle = new Circulo(5.0);
        System.out.println("Radio del círculo: " + circle.getRadio());
        System.out.println("Área del círculo: " + circle.getArea());

        Cilindro cilinder = new Cilindro(3.0, 7.0);
        System.out.println("Radio del cilindro: " + cilinder.getRadio());
        System.out.println("Altura del cilindro: " + cilinder.getAltura());
        System.out.println("Área del círculo en el cilindro: " + cilinder.getArea());
        System.out.println("Volumen del cilindro: " + cilinder.getVolumen());
    }
}
