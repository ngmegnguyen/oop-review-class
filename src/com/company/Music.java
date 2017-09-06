package com.company;


public class Music
{
   //Fields
    private String id;
    private String title;
    private String medium;
    private String comment;
    private String artist;
    private double length;
    private int tracks;

    /** Constructor for the class Music
     * @param title the title of the Music
     * @param medium the medium of the media, e.g. CD, online, mp3
     * @param artist the artist
     * @param length length of the Music in minutes
     * @param tracks the number of tracks
     */
    public Music (String title, String medium, String artist, double length, int tracks)
    {
        this.title = title;
        this.medium = medium;
        id = "";
        comment = "";
        this.artist = artist;
        this.length = length;
        this.tracks = tracks;
    }

    /** Returns the title of the media
     * @return the title of the media
     */
    public String getTitle()
    {
        return title;
    }

    /** Returns the medium of the media
     * @return the medium of the media
     */


    /** Returns the id of the media
     * @return the id of the media
     */


    /** Change the id for this media
     * @param id new id
     */
    public void setId(String id)
    {

    }

    /** Change   comment about the media
     * @param comment new comment
     */


    /** Append a new comment about the media
     * @param comment new comment
     */


    /** Returns the artist
     * @return the artist
     */


    /** Returns the length of the music in minutes
     * @return the length of the music
     */


    /** Returns the number of tracks
     * @return the number of tracks
     */



    /** Return a String representation of the music.
     * @return the String representation of the music object
     */
    public String toString()
    {

    }
}
