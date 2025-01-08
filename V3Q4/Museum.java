/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

import java.io.*;
import java.util.*;

public class Museum {
    private List<Exhibit> exhibits = new ArrayList<>();

    public void loadExhibits(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 5) {
                    exhibits.add(new Exhibit(
                        data[0], 
                        data[1], 
                        Integer.parseInt(data[2]), 
                        data[3], 
                        data[4]
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

   public void searchExhibitsByArtist(String artist) {
    for (Exhibit exhibit : exhibits) {
        if (exhibit.getArtist().equals(artist)) { 
            System.out.println(exhibit.getDetails());
        }
    }
}

    public void searchExhibitsByType(String type) {
    for (Exhibit exhibit : exhibits) {
        if (exhibit.getType().equals(type)) { 
            System.out.println(exhibit.getDetails());
        }
    }
}

    public void searchExhibitsByYear(int year) {
    for (Exhibit exhibit : exhibits) {
        if (exhibit.getYear() == year) { 
            System.out.println(exhibit.getDetails());
        }
    }
}

    public void viewAllExhibits() {
        for (Exhibit exhibit : exhibits) {
            System.out.println(exhibit.getDetails());
        }
    }
}
