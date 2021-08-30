package com.example.hexagonalarchiteturenetflix.entities.customeradress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;

public class CustomerAdress {

    private Customer customer;

    private Adress adress;

    public Customer getcustomer() {
        return customer;
    }

    public void setcustomer(Customer customer) {
        this.customer = customer;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
