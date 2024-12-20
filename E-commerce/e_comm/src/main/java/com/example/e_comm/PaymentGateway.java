package com.example.e_comm;

public class PaymentGateway {
    // Singleton: com.example.e_comm.PaymentGateway
    private static PaymentGateway instance;
    private PaymentGateway() {

    }
    public static PaymentGateway getInstance() {
        if (instance == null) {
            instance = new PaymentGateway();
        }
        return instance;
    }

    public void processPayment(String method, double amount) {
        System.out.println("Processing payment of " + amount + " using " + method);
    }

}
