package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);
        Car car = context.getBean(Car.class);

        person.setName("John");
        car.setModel("Ford");
        System.out.println(person.getName());
        System.out.println(car.getModel());
    }
}