package com.justpark;

import com.justpark.models.Address;
import com.justpark.models.people.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello everyone! Its JustPark!");
        Address a = new Address.Builder()
                .state("Uttar Pradesh")
                .country("India")
                .zipCode("123456")
                .city("Varanasi")
                .streetAddress("BHU varanasi")
                .build();

        Person lng = new Person.Builder("L.N.Gupta")
                .phoneNumber("1234567890")
                .build();

        System.out.println(a.toString());
        System.out.println(lng.toString());
    }
}
