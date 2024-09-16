package org.example.e16;

public class E16DistanceConversionModulus {
    private static int kilometrs;

    public static void main(String[] args) {
        // Declare the int variable and assign a value
      int totalMeters=1850;

        // Calculate kilometers and meters
        int dev= totalMeters/1000;
        int kilometers=dev;
        int mod =totalMeters% 1000;
        int meters= mod;



        // Print the results

        System.out.println(totalMeters +" meters is equal to  "+ kilometers +" kilometers  and "+ meters +" meters.");







    }
}
