package Desafio4;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        double cotacaoDolar = 4.80;
        double valorEmReal = valorEmDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorEmReal);
    }
}
