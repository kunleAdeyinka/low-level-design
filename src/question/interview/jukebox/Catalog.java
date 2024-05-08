package question.interview.jukebox;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<CD> albums;

    public Catalog() {
        this.generateAlbums();
    }

    public List<CD> getAlbums() {
        return albums;
    }

    private void generateAlbums() {
        this.albums = new ArrayList<>();

        // generate Songs for Jukebox Hits: '80s Rock, Vol. 1
        Song song1 =
                new Song("Sweet Child O' Mine", "Guns N Roses", "5:56", "Appetite for Destruction");
        Song song2 =
                new Song("Pour Some Sugar On Me", "Def Leppard", "4:27", "Hysteria");
        Song song3 =
                new Song("Hungry Like The Wolf", "Duran Duran", "3:40", "Rio");
        Song song4 =
                new Song("Free Fallin", "Tom Petty", "4:15", "Full Moon Fever");
        Song song5 =
                new Song("Burning Down The House", "Talking Heads", "4:03", "Speaking In Tongues");
        Song song6 =
                new Song("Walk This Way featuring Aerosmith", "Run-DMC", "5:10", "Raising Hell");
        Song song7 =
                new Song("Don't Stop Believin", "Journey", "4:09", "Escape");
        Song song8 =
                new Song("Come On Eileen", "Dexys Midnight Runners", "3:25", "Come on Eileen/Dubios - Single");


        // create CD for Jukebox Hits: '80s Rock, Vol. 1
        CD cdOne = new CD("Jukebox Hits: '80s Rock, Vol. 1");
        cdOne.getSongs().add(song1);
        cdOne.getSongs().add(song2);
        cdOne.getSongs().add(song3);
        cdOne.getSongs().add(song4);
        cdOne.getSongs().add(song5);
        cdOne.getSongs().add(song6);
        cdOne.getSongs().add(song7);
        cdOne.getSongs().add(song8);
        cdOne.setNumSongs(cdOne.getSongs().size());


        // generate Songs for Jukebox Hits: '80s Rock, Vol. 2
        Song song10 =
                new Song("Livin On a Prayer", "Bon Jovi", "4:09", "Slippery When Wet");
        Song song11 =
                new Song("Owner Of A Lonely Heart", "Def Leppard", "4:07", "Pyromania");
        Song song12 =
                new Song("Photograph", "Guns N Roses", "5:56", "Appetite for Destruction");
        Song song13 =
                new Song("Call Me", "Blondie", "5:56", "Greatest Hits ");
        Song song14 =
                new Song("The Power Of Love", "Huey Lewis & The News", "4:00", "Exitos & Hits de Los 80s");
        Song song15 =
                new Song("Here I Go Again 87", "Whitesnake", "4:35", "Whitesnake");
        Song song16 =
                new Song("Jessie's Girl", "Rick Springfield", "3:14", "Working Class Dog");
        Song song17 =
                new Song("Stand", "REM", "3:12", "Green");

        // create CD for Jukebox Hits: '80s Rock, Vol. 1
        CD cdTwo = new CD("Jukebox Hits: '80s Rock, Vol. 2");
        cdTwo.getSongs().add(song10);
        cdTwo.getSongs().add(song11);
        cdTwo.getSongs().add(song12);
        cdTwo.getSongs().add(song13);
        cdTwo.getSongs().add(song14);
        cdTwo.getSongs().add(song15);
        cdTwo.getSongs().add(song16);
        cdTwo.getSongs().add(song17);
        cdTwo.setNumSongs(cdTwo.getSongs().size());

        // add the CDs to the list of albums
        this.albums.add(cdOne);
        this.albums.add(cdTwo);
    }
}
