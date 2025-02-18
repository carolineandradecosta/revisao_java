package Desafio4;

public class Produto implements Vendavel {
    private String nome;
    private double valorUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public double calculaPrecoTotal(int quantidade) {
        return quantidade * valorUnitario;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        valorUnitario -= valorUnitario * (percentualDesconto / 100.0);
    }

}
