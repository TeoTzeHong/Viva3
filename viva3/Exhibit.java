/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author teotz
 */
public class Exhibit {
    private  String title;
    private  String artist;
    private  int year;
    private  String type;
    private  String description;

    // Constructor
    public Exhibit(String title, String artist, int year, String type, String description) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.description = description;
    }

    // Get details of the exhibit
    public String getDetails() {
        return "Title: " + title + "\n" +
               "Artist: " + artist + "\n" +
               "Year: " + year + "\n" +
               "Type: " + type + "\n" +
               "Description: " + description + "\n";
    }

    // Getters
    public String getArtist() {
        return artist;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }
}


