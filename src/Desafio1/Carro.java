package Desafio1;

public class Carro {
    String modelo;
    int ano;
    String cor;


    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano :" + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdadeDoCarro(){
          return  2025 - ano;
    };
}
