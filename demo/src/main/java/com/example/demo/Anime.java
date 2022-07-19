package com.example.demo;

public class Anime {
   private int animeId;
   private  String title;
   private String author;

   private int yearPublication;
    private  int numberEpisodes;
    private String genre;
    private  String synopsis;



    public Anime(int animeId, String title, String author, int yearPublication, int numberEpisodes, String genre, String synopsis) {
        this.animeId = animeId;
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
        this.numberEpisodes = numberEpisodes;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public int getAnimeId() {
        return animeId;
    }

    public void setAnimeId(int animeId) {
        this.animeId = animeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public int getNumberEpisodes() {
        return numberEpisodes;
    }

    public void setNumberEpisodes(int numberEpisodes) {
        this.numberEpisodes = numberEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }






}
