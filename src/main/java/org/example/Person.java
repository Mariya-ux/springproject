package org.example;

import org.springframework.stereotype.Component;

@Component

public class Person {
    private String name ="Alice";

    public String getName() {
        return name;
    }
}
