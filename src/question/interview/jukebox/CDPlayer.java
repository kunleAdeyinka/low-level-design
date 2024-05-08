package question.interview.jukebox;

public class CDPlayer implements CDSelector{

    private CD selectedAlbum;

    private Song selectedSong;

    private int songId;

    private int albumId;

    public CDPlayer() {
        this.songId = 0;
        this.albumId = 0;
    }


    public CD getSelectedAlbum() {
        return selectedAlbum;
    }

    public void setSelectedAlbum(CD selectedAlbum) {
        this.selectedAlbum = selectedAlbum;
    }

    public Song getSelectedSong() {
        return selectedSong;
    }

    public void setSelectedSong(Song selectedSong) {
        this.selectedSong = selectedSong;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    // loads in the selected CD
    @Override
    public void loadSelectedCD() {
        System.out.println("Loading :: " + this.selectedAlbum.getAlbumName());
    }

    // handles player commands
    @Override
    public void playSong() {
        System.out.println("Playing :: " + this.selectedSong.getSongName());
        System.out.println("By :: " + this.selectedSong.getArtistName());
        System.out.println("From :: " + this.selectedSong.getAlbumName());
        System.out.println("Time :: " + this.selectedSong.getSongLength());
    }
}
