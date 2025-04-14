public class Circulo implements Forma{
    private double raio, pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (this.raio * this.raio);
    }

}
