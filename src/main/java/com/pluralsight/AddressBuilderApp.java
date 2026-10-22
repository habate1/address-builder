package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.println("Full name: ");
        String fullName = myscanner.next();
        System.out.println("Billing Street:");
        String billingStreet = myscanner.next();
        System.out.println("Billing City:");
        String billingCity = myscanner.next();
        System.out.println("Billing State:");
        String billingState = myscanner.next();
        System.out.println("Billing Zip:");
        String billingZip = myscanner.next();

        System.out.println("Shipping Street:");
        String shippingStreet = myscanner.next();
        System.out.println("Shipping City:");
        String shippingCity = myscanner.next();
        System.out.println("Shipping State:");
        String shippingState = myscanner.next();
        System.out.println("Shipping Zip:");
        String shippingZip = myscanner.next();

        System.out.println(fullName);
        System.out.println("Billing Address:");
        System.out.println(billingStreet);
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingCity);
        billingAddress.append(billingState);
        billingAddress.append(billingZip);
        System.out.println(billingAddress);





    }
}
