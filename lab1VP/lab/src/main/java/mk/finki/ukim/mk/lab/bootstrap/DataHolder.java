package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Artist;
import mk.finki.ukim.mk.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DataHolder {
    public static List<Artist> artists =new ArrayList<Artist>();
    public static List<Song> songs =new ArrayList<>();

    @PostConstruct
    public void init(){
        artists.add(new Artist(223204L,"Denzel","Curry","King"));
        artists.add(new Artist(223026L,"Mos","Def","King"));
        artists.add(new Artist(223277L,"Fivio","Foreign","King"));
        artists.add(new Artist(223152L,"Polo","G","King"));
        artists.add(new Artist(225125L,"Eazy","E","King"));

        songs.add(new Song("1244","Cole Pimp","Rap",2024));
        songs.add(new Song("1245", "Mathematics", "Rap", 1999));
        songs.add(new Song("1246", "Story Time", "Drill", 2021));
        songs.add(new Song("1247", "Heartless", "RnB", 2019));
        songs.add(new Song("1248", "8 Ball", "Rap", 1993));
    }
}
