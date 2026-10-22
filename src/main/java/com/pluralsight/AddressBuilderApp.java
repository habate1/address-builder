package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        // prompt and store values from user
        // asking specifically for billing information
        System.out.println("Please provide the following information:");
        System.out.println("Full name: ");
        String fullName = myscanner.nextLine();
        System.out.println("Billing Street:");
        String billingStreet = myscanner.nextLine();
        System.out.println("Billing City:");
        String billingCity = myscanner.nextLine();
        System.out.println("Billing State:");
        String billingState = myscanner.nextLine();
        System.out.println("Billing Zip:");
        String billingZip = myscanner.nextLine();


        // prompt and store values from user
        // asking specifically for shipping information
        System.out.println("Shipping Street:");
        String shippingStreet = myscanner.nextLine();
        System.out.println("Shipping City:");
        String shippingCity = myscanner.nextLine();
        System.out.println("Shipping State:");
        String shippingState = myscanner.nextLine();
        System.out.println("Shipping Zip:");
        String shippingZip = myscanner.nextLine();

        // print output - billing address
        System.out.println(fullName);
        System.out.println("Billing Address:");
        System.out.println(billingStreet);

        // dynamically build the string that holds all the address
        //information. and then print
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(", ");
        billingAddress.append(billingZip);
        System.out.println(billingAddress);

        // print output - shipping address
        System.out.println("\n");
        System.out.println("Shipping Address:");
        System.out.println(billingStreet);

        // dynamically build the string that holds all the address
        //information. then print
        StringBuilder shippingAddress = new StringBuilder(); // create empty StringBuilder to build final shipping address in one line
        shippingAddress.append(shippingCity).append(", ");
        shippingAddress.append(shippingState).append(", ");
        shippingAddress.append(shippingZip);
        System.out.println(shippingAddress);






    }
}
