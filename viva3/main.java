/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva3;


public class main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        
        // Load exhibits from the file
        museum.loadExhibits("Exhibits.txt");
        
 
        // View all exhibits
        System.out.println("All exhibits:");
        museum.viewAllExhibits();

        // Search by artist
        System.out.println("\nSearch exhibits by artist 'Vincent van Gogh':");
        museum.searchExhibitsByArtist("Vincent van Gogh");

        // Search by type
        System.out.println("\nSearch exhibits by type 'Painting':");
        museum.searchExhibitsByType("Painting");

        // Search by year
        System.out.println("\nSearch exhibits by year '1504':");
        museum.searchExhibitsByYear(1504);
    }
}
