package com.example.e_comm;

public interface CartSubject {

    void attach(CartObserver observer);
    void detach(CartObserver observer);
    void notifyObservers();

}
