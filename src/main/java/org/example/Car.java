package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
