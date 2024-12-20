package com.example.e_comm;


import java.util.List;

public interface CartObserver {

    void update(List<Product> cart);
}
