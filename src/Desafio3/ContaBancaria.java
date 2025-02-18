package Desafio3;

public class ContaBancaria {
    protected double saldo;


    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Depósito de " + valorDeposito + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valorSacar){
        if(saldo >= valorSacar){
            this.saldo -= valorSacar;
            System.out.println("Saque de " + valorSacar + " realizado com sucesso. Saldo atual= " + saldo );
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

}
