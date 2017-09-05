package com.company;

/**
 *The MediaLibrary keeps track of a collection of midia objects
 */
import java.util.*;

public class MediaLibrary
{
    private HashMap<String,Music> medias;
    private int nextId;

    /**
     * Constructor for objects of class MediaLibrary
     */
    public MediaLibrary()
    {
        medias = new HashMap<String,Music>();
        nextId = 100;
    }

    /**
     * Add a media to the library collection
     * @param item media to add
     */
    public void addMedia(Music item){
        item.setId("" + nextId);
        medias.put(item.getId(),item);
        nextId++;
    }


    /** Print info about all media in library
     *
     */
    public void printLibrary(){
        for(Music item:medias.values()){
            System.out.println(item);
            System.out.println();
        }
    }
}

