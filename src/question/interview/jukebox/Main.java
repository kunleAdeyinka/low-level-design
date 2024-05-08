package question.interview.jukebox;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // create the jukebox class
        Jukebox jukebox = new Jukebox();

        // display the list of songs on all the CDs to the user
        jukebox.displayCatalog();

        // accept and handle the user's selection and extract them into integer values
        Scanner scanner = new Scanner(System.in);
        String userSelection = scanner.nextLine();
        String[] inputSelection = userSelection.split(":");
        Integer albumId = Integer.valueOf(inputSelection[0]);
        Integer songId = Integer.valueOf(inputSelection[1]);

        // get the user's song selection and save it
        jukebox.getSongSelection(albumId, songId);

        // display the user's song selection
        jukebox.displaySongSelection();

        // User can select play, next, prev or q to quit
        System.out.println("Enter p to play song, > for next Song, < for previous song, q to quit jukebox: ");
        String cdCommand = scanner.nextLine();

        while(!cdCommand.equals("q")) {

            if(cdCommand.equals("p")) {
                jukebox.handlePlayCommand(cdCommand);
            } else if(cdCommand.equals(">")) {
                jukebox.handleNextCommand(cdCommand);
            } else if(cdCommand.equals("<")){
                jukebox.handlePrevCommand(cdCommand);
            } else if(cdCommand.length() == 3 && cdCommand.contains(":")){
                String[] selection = cdCommand.split(":");
                Integer albumNum = Integer.valueOf(selection[0]);
                Integer songNum = Integer.valueOf(selection[1]);

                // get the user's song selection and save it
                jukebox.getSongSelection(albumNum, songNum);

                // display the user's song selection
                jukebox.displaySongSelection();

                // play song selection
                jukebox.handlePlayCommand("p");
            }

            cdCommand = scanner.nextLine();
        }
    }
}
