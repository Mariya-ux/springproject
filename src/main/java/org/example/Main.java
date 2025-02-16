package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Person person = context.getBean(Person.class);
        Car car = context.getBean(Car.class);

        System.out.println(person.getName());
        System.out.println(car.getModel());
    }
}