package com.tavaresProg;

public class Conteudo {

    private final String titulo;
    private final String classificacao;
    private final String ano;

    Conteudo(String titulo, String classificacao, String year){
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.ano = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClassificacao(){

        return classificacao;
    }

    public String getAno(){

        return ano;
    }


}
