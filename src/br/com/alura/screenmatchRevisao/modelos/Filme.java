package br.com.alura.screenmatchRevisao.modelos;

import br.com.alura.screenmatchRevisao.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getAutor() {
        return diretor;
    }

    public void setAutor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
