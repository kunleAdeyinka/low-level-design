package question.interview.jukebox;

public class Song {

    private String songName;

    private String artistName;

    private String songLength;

    private String albumName;

    public Song(String songName, String artistName, String songLength, String albumName) {
        this.songName = songName;
        this.artistName = artistName;
        this.songLength = songLength;
        this.albumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongLength() {
        return songLength;
    }

    public String getAlbumName() {
        return albumName;
    }
}
