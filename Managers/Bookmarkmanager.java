package com.mine.managers;

import com.mine.entities.Book;
import com.mine.entities.Weblink;
import com.mine.entities.movie;

public class Bookmarkmanager {
    private static Bookmarkmanager instance =new Bookmarkmanager();
    private Bookmarkmanager(){}

    private static Bookmarkmanager getInstance()
    {
        return instance;
    }

    private movie  createmovie(long id, String title, String profileurl,int releaseyear, String cast[],String directors[], String genre, double imdbrating)
    {
        movie movie = new movie();
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setImdbrating(imdbrating);
        movie.setGenre(genre);
        movie.setId(id);
        movie.setProfileurl(profileurl);
        movie.setTitle(title);

        return movie;
    }

    public Book createbook(long id, String title, int publicationyear, String genre, String author[], double amazonrating)
    {
        Book book = new Book();
        book.setAmazonrating(amazonrating);
        book.setGenre(genre);
        book.setId(id);
        book.setPublicationyear(publicationyear);
        book.setAuthors(author);

        return book;

    }

    public Weblink createweblink(long id, String title,String url, String host)
    {
        Weblink weblink= new Weblink();
        weblink.setHost(host);
        weblink.setId(id);
        weblink.setProfileurl(url);
        weblink.setTitle(title);

        return weblink;

    }
}
