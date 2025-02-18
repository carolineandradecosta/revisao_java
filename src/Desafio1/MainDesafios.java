package Desafio1;

public class MainDesafios {
    public static void main(String[] args) {
        // Desafio Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibeMensagem();

        Calculadora calculadora1 = new Calculadora();
        System.out.println(calculadora1.dobroDoNumero(2.0));

        // Desafio Música
        Musica musica1 = new Musica();
        musica1.titulo = "Nome da música";
        musica1.artista = "Nome do Artista";
        musica1.anoLancamento = 2024;

        musica1.exibeFichaTecnica();

        musica1.avalia(8.0);
        musica1.avalia(8.5);
        musica1.avalia(7.0);

        double mediaDasAvaliacoes = musica1.calculaMediaAvaliacoes();
        System.out.println("Média das avaliações: " + mediaDasAvaliacoes);

        // Desafio Carro
        Carro carro1 = new Carro();
        carro1.modelo = "Golf";
        carro1.ano = 2007;
        carro1.cor = "Preto";

        carro1.exibeFichaTecnica();

        int idadeDoCarro = carro1.calculaIdadeDoCarro();
        System.out.println("A idade do carro é: " + idadeDoCarro);

        // Desafio Aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carol";
        aluno1.idade = 32;

        aluno1.exibeFichaAluno();
    }
}
