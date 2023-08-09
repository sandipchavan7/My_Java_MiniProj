package com.edubridge.sms.model;

import java.util.Scanner;

public class FeeCollection extends FeeDetails {
    public void collectFees() throws InterruptedException {
        System.out.println("Enter the amount for payment");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        
        
        Thread.sleep(2000);
        System.out.println("Payment Successful!!");
        System.out.println("Pending Fees: " + (fees - amount));
    }
}
