package com.mine.entities;

public class Book  extends Bookmark{
    private int publicationyear;
    private String genre, publishers;
    private String authors[];
    private double amazonrating;

    public int getPublicationyear() {
        return publicationyear;
    }

    public void setPublicationyear(int publicationyear) {
        this.publicationyear = publicationyear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public double getAmazonrating() {
        return amazonrating;
    }

    public void setAmazonrating(double amazonrating) {
        this.amazonrating = amazonrating;
    }
}
