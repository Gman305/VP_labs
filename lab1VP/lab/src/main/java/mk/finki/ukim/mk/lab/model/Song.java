package mk.finki.ukim.mk.lab.model;

import java.util.ArrayList;
import java.util.List;

public class Song {
    String trackId;
    String title;
    String genre;
    int releaseYear;
    List<Artist> performers;

    public Song(String trackId, String title, String genre, int releaseYear) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers=new ArrayList<>();
    }

    public void addArtist(Artist artist) {

        performers.add(artist);
    }

    public String getTrackId() {

        return trackId;
    }

    public void setTrackId(String trackId) {

        this.trackId = trackId;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

    public int getReleaseYear() {

        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {

        this.releaseYear = releaseYear;
    }

    public List<Artist> getPerformers() {

        return performers;
    }

    public void setPerformers(List<Artist> performers) {

        this.performers = performers;
    }
}
