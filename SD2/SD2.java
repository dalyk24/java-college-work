/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2;

/**
 *
 * @author Killian Daly
 */
public class SD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create objects array for all planes' type, speed and range
        Planes[] plane = new Planes[6];
        plane[0] = new Planes("Boeing 747", 920, 13000);
        plane[1] = new Planes("Boeing 737", 820, 5649);
        plane[2] = new Planes("Boeing 777", 970, 14300);
        plane[3] = new Planes("Boeing 787", 950, 16000);
        plane[4] = new Planes("Boeing BBJ", 750, 7200);
        plane[5] = new Planes("Boeing C17", 800, 4500);
        
        // Store all destinations and the distance to them in 2D string array 
        String [][] destinations = {{"Sydney","15461"},
            {"New York","5112"},
            {"Auckland","18167"},
            {"London","461"},
            {"Dubai","7760"},
        };
        
        // Loop through plane objects array and destinations array to print formatted plane headings,
        // in/out of range for each destination, their travel times and a blank line for spacing
        for(int i = 0; i < plane.length; i++) {
            plane[i].heading();
            for(int j = 0; j < destinations.length; j++) {
                plane[i].inRange(destinations[j][0], destinations[j][1]);
                plane[i].travelTimes(destinations[j][0], destinations[j][1]);
            }
            System.out.println();
        }
        
    }
    
}
