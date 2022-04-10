package com.mine.entities;

public class movie extends Bookmark{
    private int releaseyear;
    private String cast[], directors[];
    private String genre;
    private double imdbrating;

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String[] getDirectors() {
        return directors;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(double imdbrating) {
        this.imdbrating = imdbrating;
    }
}
