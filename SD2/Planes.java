package sd2;

/**
 *
 * @author Killian Daly
 */
public class Planes {
    // Set up attributes to construct plane objects, and distance variable
    String type;
    int speed;
    int range;
    float distance;
    
    public Planes(String type, int speed, int range) {
        // Initialise type, speed and range attributes of plane objects
        this.type = type;
        this.speed = speed;
        this.range = range;
    }
    
    public void heading() {
        // Print formatted heading with plane type and flight information
        System.out.printf("%s%n", type);
        System.out.printf("%s\t%s\t%s%n", "Destinations", "Distances", "Travel Times");
        System.out.println("----------------------------------------------");
    }
    
    public void inRange(String place, String distanceStr) {
        // Convert string destionations array distance to float
        distance = Float.parseFloat(distanceStr);
        // Check if plane range is less than destination distance or not, then print message
        // with result and destination name under appropriate headings
        if(range >= distance) {
            System.out.printf("%s%s\t%s", place, ":  ", "in range");
        }
        else {
            System.out.printf("%s%s\t%s", place, ":  ", "out of range");
        }
    }
       
    public void travelTimes(String place, String distanceStr) {
        // Set up method variables for plane flight speed and times
        float speedo;
        int minutes;
        int hours;
        double decimalMins;
        // Convert string distance from destinations array to float
        distance = Float.parseFloat(distanceStr);
        // Check if plane range is less than destination distance, if in range divide distance
        // by speed and convert figure to integer to remove decimals for travel time hours
        if(range >= distance) {
            speedo = distance / speed;
            hours = (int)speedo;
            // Isolate decimals and multiply by 0.6 to convert to out of 60, then round and 
            // multiply by 100 for minutes
            decimalMins = (speedo - Math.floor(speedo)) * 0.6;
            minutes = (int)Math.round((decimalMins * 100));
            // If hours and minutes are greater than 0, print both under headings
            if(hours > 0 && minutes > 0){
                System.out.printf("\t%d%s%d%s%n", hours, " hrs ", minutes, " mins");
            }
            // If minutes are 0, print hours under headings
            else if(minutes == 0){
                System.out.printf("\t%d%s%n", hours, " hrs");
            }
            // If hours are 0, print minutes under headings
            else {
                System.out.printf("\t%d%s%n", minutes, " mins");
            }
        }
        // If plane is not in range, print message advising of no flight times
        else {
            System.out.printf("\t%s%n", "N/A");
        }       
    }
        
}
    

    


    


