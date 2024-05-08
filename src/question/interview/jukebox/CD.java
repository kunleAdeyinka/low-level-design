package question.interview.jukebox;

import java.util.ArrayList;
import java.util.List;

public class CD {

    private String albumName;

    private List<Song> songs;

    private Integer numSongs;

    private String totalTime;

    public CD() {
        this.songs = new ArrayList<>();
    }

    public CD(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<>();
    }

    public void setNumSongs(Integer numSongs) {
        this.numSongs = numSongs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Integer getNumSongs() {
        return numSongs;
    }

    public String getTotalTime() {
        return totalTime;
    }
}
