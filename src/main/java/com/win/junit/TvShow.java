package com.win.junit;

public class TvShow {
    private int episodes;
    private String genre;
    private String name;

    public TvShow(String showname, String showgenre, int epi) {
        name = showname;
        genre = showgenre;
        episodes = epi;
    }
    public TvShow() {
       
    }
    public TvShow(String showname1, String showgenre1) {
        name = showname1;
        genre = showgenre1;
     
    }
    public TvShow( String showgenre2, int epi2) {
        
        genre = showgenre2;
        episodes = epi2;
     
    }
    public String getName() {
        return name;
    }
        
    public String getgenre() {
        return genre;
    }
    public int getepisodes() {
        return episodes;
    }

    public String toString() {
        String s;
        s = "The name of the show is " + getName() + " With " + getepisodes() + " number of episodes. The genre is "
                + getgenre();
        return s;
    }
}
