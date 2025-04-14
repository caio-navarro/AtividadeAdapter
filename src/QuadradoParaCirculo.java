public class QuadradoParaCirculo implements Forma{
    private final Quadrado quadrado;

    public QuadradoParaCirculo(Quadrado quadrado) {
        this.quadrado = quadrado;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (2 * quadrado.getLado());
    }

}
