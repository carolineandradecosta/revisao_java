package Desafio4;

public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double valor) {
        return valor * 0.9;
    }
}
