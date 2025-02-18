package Desafio3;

public class Principal3 {
    public static void main(String[] args) {
        // Carro
        ModeloCarro carro1 = new ModeloCarro();
        carro1.definirModelo("Golf");
        carro1.definirPrecos(60000, 48000, 35000);
        carro1.exibirInfo();
        carro1.setCorCarro("Prata");


        // Animal
        Animal animal1 = new Animal();
        animal1.emitirSom();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();

        Gato gato1 = new Gato();
        gato1.emitirSom();
        gato1.arranharMoveis();

        // Conta
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.depositar(1000);

        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.depositar(2000);
        contaCorrente1.cobrarTarifaMensal();
        contaCorrente1.sacar(500);

        //Números primos
        NumerosPrimos numerosPrimos1 = new NumerosPrimos();
        System.out.println(numerosPrimos1.verificarPrimalidade(11));
        numerosPrimos1.listarPrimos(100);

        VerificadorPrimo verificadorPrimo1 = new VerificadorPrimo();
        verificadorPrimo1.verificarSeEhPrimo(11);

        GeradorPrimo geradorPrimo1 = new GeradorPrimo();
        int promixoPrimo = geradorPrimo1.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + promixoPrimo);
    }
}
