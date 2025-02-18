package Desafio4;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double valor) {
        return valor * 1.05;
    }
}
