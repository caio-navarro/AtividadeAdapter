public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        QuadradoParaCirculo adaptador = new QuadradoParaCirculo(quadrado);

        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Area do circulo: " + adaptador.calcularArea());
    }
}
