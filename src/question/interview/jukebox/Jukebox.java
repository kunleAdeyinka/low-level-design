package question.interview.jukebox;

import java.util.List;

public class Jukebox implements Controls{
    // has a CDPlayer
    private CDPlayer cdPlayer;

    private Song selectedSong;

    private Catalog catalog;

    public Jukebox() {
        this.catalog = new Catalog();
        this.cdPlayer = new CDPlayer();
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public Song getSelectedSong() {
        return selectedSong;
    }

    public void setSelectedSong(Song selectedSong) {
        this.selectedSong = selectedSong;
    }

    // displays a list of songs in its catalog
    @Override
    public void displayCatalog() {
        System.out.println("***** WELCOME TO THE I LOVE THE 80s JUKEBOX *****");
        System.out.println("***** Select a song using the Album # and Song # *****");
        System.out.println("***** Example Song Name:: Sweet Child O' Mine by Artist Name:: Guns N Roses: 0:0 *****");

        // displays a list of songs with where the user selects the CD id and song id
        List<CD> albums = catalog.getAlbums();

        for (int k = 0; k < albums.size(); k++) {
            CD album = albums.get(k);
            for (int i = 0; i < album.getSongs().size(); i++) {
                System.out.println("Album #:: " + k + "  CD Name:: " + album.getAlbumName() + "  Song #:: " + i + "  Song Name:: " + album.getSongs().get(i).getSongName() + " Artist Name:: " + album.getSongs().get(i).getArtistName());
            }
        }
    }

    @Override
    public void getSongSelection(int albumId, int songId) {
        List<CD> albums = catalog.getAlbums();

        // get the CD first
        CD album = albums.get(albumId);

        // get the song next
        Song song = album.getSongs().get(songId);

        this.setSelectedSong(song);
        this.cdPlayer.setSelectedSong(song);
        this.cdPlayer.setSelectedAlbum(album);
        this.cdPlayer.setSongId(songId);
        this.cdPlayer.setAlbumId(albumId);
    }

    @Override
    public void handlePlayCommand(String command) {
        // call the cdplayer object's play selected song from album method
        this.cdPlayer.playSong();
    }

    @Override
    public void handleNextCommand(String command) {
        // get the albumId
        int albumId = this.cdPlayer.getAlbumId();

        // get the songId
        int songId = this.cdPlayer.getSongId();

        // select the album from the list of albums
        CD album = this.catalog.getAlbums().get(albumId);

        // select the next song from the CD, if next number is greater than the length of the list recount from 0
        if ((songId + 1) > (album.getSongs().size() - 1)) {

            songId = 0;
        } else {
            songId += 1;
        }
        Song song = album.getSongs().get(songId);

        this.setSelectedSong(song);
        this.cdPlayer.setSelectedSong(song);
        this.cdPlayer.setSongId(songId);
        this.cdPlayer.setAlbumId(albumId);

        this.handlePlayCommand("p");
    }

    @Override
    public void handlePrevCommand(String command) {
        // get the albumId
        int albumId = this.cdPlayer.getAlbumId();

        // get the songId
        int songId = this.cdPlayer.getSongId();

        // select the album from the list of albums
        CD album = this.catalog.getAlbums().get(albumId);

        // select the next song from the CD, if next number is greater than the length of the list recount from 0
        if ((songId - 1) < 0) {
            songId = album.getSongs().size() - 1;
        } else {
            songId -= 1;
        }

        Song song = album.getSongs().get(songId);

        this.setSelectedSong(song);
        this.cdPlayer.setSelectedSong(song);
        this.cdPlayer.setSongId(songId);
        this.cdPlayer.setAlbumId(albumId);

        this.handlePlayCommand("p");
    }

    @Override
    public void displaySongSelection() {
        this.cdPlayer.loadSelectedCD();
        System.out.println("You Selected:: " + this.selectedSong.getSongName() + " by " + this.selectedSong.getArtistName());
    }
}
