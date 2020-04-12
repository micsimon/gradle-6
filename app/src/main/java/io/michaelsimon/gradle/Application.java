package io.michaelsimon.gradle;

import io.michaelsimon.gradle.data.Person;
import io.michaelsimon.gradle.service.PersonService;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public static void main(String[] args) {
        Person person = new Person("Haraldd", 14);
        var name = StringUtils.trim(person.getName());
        System.out.println("Hello " + name);

        new PersonService().sayHello();
    }
}
