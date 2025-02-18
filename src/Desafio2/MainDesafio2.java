package Desafio2;

public class MainDesafio2 {
    public static void main(String[] args) {
        // Idade Pessoa
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carol");
        pessoa1.setIdade(32);
        pessoa1.verificarIdade();

        // Produto
        Produto produto1 = new Produto();
        produto1.setNome("cadeira");
        produto1.setPreco(1500.00);
        System.out.println(produto1.aplicarDesconto(50));

        // Aluno
        Aluno aluno1 = new Aluno("Carol",8.5, 9.0, 10.0);
        System.out.println(aluno1.calcularMedia());

        // Livro
        Livro livro1 = new Livro("Lógica de programação", "Paulo Silveira");
        livro1.exibirDetalhes();
    }

}
