package Desafio4;

public class Principal4 {
    public static void main(String[] args) {
        // Conversor de Moeda
        ConversorMoeda conversorMoeda1 = new ConversorMoeda();
        conversorMoeda1.converterDolarParaReal(15.0);

        // Calcula área retangular
        CalculadoraSalaRetangular calculadoraSalaRetangular1 = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular1.calcularArea(1.20, 2.30);
        calculadoraSalaRetangular1.calcularPerimetro(1.20, 2.30);

        // Tabuada
        TabuadaMultiplicacao tabuadaMultiplicacao1 = new TabuadaMultiplicacao();
        tabuadaMultiplicacao1.mostrarTabuada(2);

        // Conversor de temperatura
        ConversorTemperaturaPadrao conversorTemperaturaPadrao1 = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao1.celsiusParaFahrenheit(25);
        conversorTemperaturaPadrao1.fahrenheitParaCelsius(77);

        // Calculavel
        Livro livro1 = new Livro();
        System.out.println(livro1.calcularPrecoFinal(5));

        ProdutoFisico produto1 = new ProdutoFisico();
        System.out.println(produto1.calcularPrecoFinal(4));

        // Vendavel
        Produto produto2 = new Produto();
        produto2.setValorUnitario(5);
        produto2.aplicarDesconto(10);
        System.out.println(produto2.calculaPrecoTotal(5));

        Servico servico1 = new Servico();
        servico1.setPrecoHora(50);
        servico1.aplicarDesconto(10);
        System.out.println(servico1.calculaPrecoTotal(5));
    }
}
