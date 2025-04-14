public class Quadrado implements Forma{
    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }
}
