package com.tavaresProg;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao App que consume algumas APIs do IMDb");
        System.out.println("Insira sua ApiKey: ");
        String apiKey = scanner.nextLine();

        boolean aguardandoResposta = true;
        String url = "";

        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Top 10 Filmes mais populares ");
            System.out.println("2- Top 10 Filmes melhores classificados");
            System.out.println("3- Top 10 Séries mais populares");
            System.out.println("4- Top 10 Séries melhores classificadas ");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                Url selecionarUrl = new Url();
                url = selecionarUrl.getFilmesMaisPopulares() + apiKey;
                System.out.println(url);
                aguardandoResposta = false;

            }

            else if (resposta == 2) {
                Url selecionarUrl = new Url();
                url = selecionarUrl.getFilmesMelhoresClassificados() + apiKey;
                System.out.println(url);
                aguardandoResposta = false;
            }

            else if (resposta == 3) {
                Url selecionarUrl = new Url();
                url = selecionarUrl.getSeriesMaisPopulares() + apiKey;
                System.out.println(url);
                aguardandoResposta = false;
            }

            else if (resposta == 4) {
                Url selecionarUrl = new Url();
                url = selecionarUrl.getSeriesMelhoresClassificadas() + apiKey;
                System.out.println(url);
                aguardandoResposta = false;
            }

            else {

                System.out.println("Opção inválida!");
            }


        } while (aguardandoResposta);

        ExtratorDeConteudoDoIMDB extrator = new ExtratorDeConteudoDoIMDB();
        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        List<Conteudo> conteudos = extrator.ExtratorDeConteudoDoIMDB(json);

        for (int i = 0; i < 10; i++) {

            Conteudo conteudo = conteudos.get(i);
            System.out.println("Título: " + conteudo.getTitulo());
            System.out.println("Data de lançamento: " + conteudo.getAno());
            System.out.println("Rating: " +conteudo.getClassificacao());

            if(conteudo.getClassificacao().isEmpty()){
                System.out.println("Rating ainda não consolidado!");
            } else {
                Double estrelas = (double) Math.floor(Double.parseDouble(conteudo.getClassificacao()));
                for (int j = 0; j < estrelas; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}