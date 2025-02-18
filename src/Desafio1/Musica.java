package Desafio1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMediaAvaliacoes(){
        return somaAvaliacao / numAvaliacoes;
    };

}
