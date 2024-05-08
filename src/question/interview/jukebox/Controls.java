package question.interview.jukebox;

public interface Controls {

    void displayCatalog();

    void getSongSelection(int albumId, int songId);

    void handlePlayCommand(String command);

    void handleNextCommand(String command);

    void handlePrevCommand(String command);

    void displaySongSelection();
}
