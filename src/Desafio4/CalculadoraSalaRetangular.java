package Desafio4;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double base, double altura) {
       double areaRetangulo =  base * altura;
        System.out.println("A área da sala retangular é: " + areaRetangulo);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double areaPerimetro = 2 * (base + altura);
        System.out.println("O perímetro da sala retangular é: " + areaPerimetro);
    }
}
