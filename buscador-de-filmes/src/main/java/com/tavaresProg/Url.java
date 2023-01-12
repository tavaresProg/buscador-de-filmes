package com.tavaresProg;

public class Url {

    private String filmesMaisPopulares ="https://imdb-api.com/en/API/MostPopularMovies/";
    private String filmesMelhoresClassificados = "https://imdb-api.com/en/API/Top250Movies/";
    private String seriesMaisPopulares = "https://imdb-api.com/en/API/MostPopularTVs/";
    private String seriesMelhoresClassificadas = "https://imdb-api.com/en/API/Top250TVs/";

    public String getFilmesMaisPopulares() {
        return filmesMaisPopulares;
    }

    public String getFilmesMelhoresClassificados() {
        return filmesMelhoresClassificados;
    }

    public String getSeriesMaisPopulares() {
        return seriesMaisPopulares;
    }

    public String getSeriesMelhoresClassificadas() {
        return seriesMelhoresClassificadas;
    }
}
