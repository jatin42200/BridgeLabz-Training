public class FindVolume {
    public static void main(String[] args) {
        double radius=6378;
        double pi=3.14;      
        // volume in kilo meters
        double volumeInKm =(4.0/3.0)*pi*Math.pow(radius, 3);
        // volume in miles
        double kmToMiles = 0.621371; // 1 km = 0.621371 miles
        double volumeInMiles = volumeInKm*Math.pow(kmToMiles, 3);
        //print the output
        System.out.println("The volume of earth in kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);
    }
}