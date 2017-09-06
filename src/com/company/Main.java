package com.company;

public class Main {

    public static void main(String[] args) {
        MediaLibrary library = new MediaLibrary();
         // Add two music object to the library
        Music track1 = new Music("Hello", "mp3", "Adele", 3.14, 1);
        Music track2 = new Music("New Divide", "mp3", "Linkin Park", 4.02, 2);
        library.addMedia(track1);
        library.addMedia(track2);
        // Print the library
        library.printLibrary();
    }
}
