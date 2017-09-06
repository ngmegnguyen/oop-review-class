package com.company;

public class Main {

    public static void main(String[] args) {
        MediaLibrary library = new MediaLibrary();
        // Add two music objects to the library
        Music CD = new Music("Song", "CD", "Katherine Ngo", 17, 5);
        Music USB = new Music("Another Song", "Records", "Megan Nguyen", 60, 12);

        library.addMedia(CD);
        library.addMedia(USB);

        // Print the library

        library.printLibrary();

    }
}
