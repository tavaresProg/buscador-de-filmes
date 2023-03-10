package com.tavaresProg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDoIMDB {

    public List<Conteudo>ExtratorDeConteudoDoIMDB(String json){

        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos= parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        //popular a lista de conteudos
        for (Map<String, String> atributos : listaDeAtributos ) {

            String titulo = atributos.get("title");
            String classificacao = atributos.get("imDbRating");
            String ano = atributos.get("year");
            var conteudo = new Conteudo(titulo, classificacao, ano);

            conteudos.add(conteudo);
        }

        return conteudos;
    }

}
