package iegcode.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void testViaConstructor() {

        var hobbies = new ArrayList<String>();
        hobbies.add("id");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = new Person("id", "name", 19, hobbies);
        System.out.println(person);
    }

    @Test
    void CreatViaSetter() {
        var hobbies = new ArrayList<String>();
        hobbies.add("id");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = new Person();
        person.setId("id");
        person.setName("name");
        person.setAge(19);
        person.setHobbies(hobbies);

        System.out.println(person);
    }

    @Test
    void createViaBuilder() {
        var person = Person.builder()
                .id("id")
                .name("name")
                .age(19)
                .hobby("coding")
                .hobby("Eating")
                .hobby("reading")
                .build();

        System.out.println(person);
    }
}
