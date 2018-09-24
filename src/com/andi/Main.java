package com.andi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        CEPPurchasePower cepPurchasePower = new CEPPurchasePower();
        DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
        ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();

        cepPurchasePower.setSuccessor(directorPurchasePower);
        directorPurchasePower.setSuccessor(cepPurchasePower);
        managerPurchasePower.setSuccessor(directorPurchasePower);

        while (true) {
            System.out.println("Enter the amount to check for approval: ");
            System.out.print(">> ");
            try {
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                managerPurchasePower.processRequest(new PurchaseRequest(d, "By Stuff"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
