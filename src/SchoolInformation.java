//Author: Halena Wetton
//Date: January 20, 2020
//File: SchoolInformation.java

public class SchoolInformation {
    public static void main(String[] args) {

        //Declare variables
        String firstName = "Halena";
        String lastName = "Wetton";
        byte numClasses = 3;
        short cupsOfCoffee = 5;
        float expectedGpa = 3.7f;
        int netflixHours = 25;
        double actualNetflixHours = Double.POSITIVE_INFINITY;

        //Add in print statement
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Number of classes enrolled in : " + numClasses);
        System.out.println("Cups of coffee consumed : " + cupsOfCoffee);
        System.out.println("Expected GPA : " + expectedGpa);
        System.out.println("Hours spent watching Netflix : " + netflixHours);
        System.out.println("Number of actual hours watching Netflix : " + actualNetflixHours);

    }
}
