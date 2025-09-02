package com.di.factura.springboot_di_factura.models;

import org.springframework.stereotype.Component;

@Component
public class Client {
    private String name;
    private String lastName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
