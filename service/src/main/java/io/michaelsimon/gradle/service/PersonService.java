package io.michaelsimon.gradle.service;

import io.michaelsimon.gradle.data.Person;

public class PersonService {

    public void sayHello() {
        Person person = new Person("Hans", 44);
        System.out.println(person);
    }
}
