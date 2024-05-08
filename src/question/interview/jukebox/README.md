# DESIGN A JUKEBOX

## A. What is a Jukebox
1. Is a device that plays music user's select after inserting a coin
2. The user selects an option of what music they want to listen to from a user interface
3. The music can be disc, vinyl or mp3 music files.

## B. Requirements
### 1. Questions 
- does the jukebox play CDs, vinyl or MP3s? Vinyl
- does the jukebox free or paid: free 
- do we design how it works: user selects a song from the list of songs and the CDPlayer plays it.

### 2. Functional requirements
- Jukebox displays a list of songs to a user
- Jukebox should allow a user to select a song from a CD based on the code on the screen
- Jukebox should allow a user to move to the next song using CD Player
- Jukebox should allow a user scroll to previous songs on the CD using CD Player

## C. Application Classes
1. Jukebox class
2. CDPlayer class
3. Song
4. CD
5. User


## D. Relationships between Classes
1. Jukebox has a CDPlayer: One to One
2. CDPlayer has a list of CDs: One to Many
3. CD has a list of Songs: One to Many


##



##