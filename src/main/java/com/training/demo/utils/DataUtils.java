package com.training.demo.utils;

import com.github.javafaker.Faker;

public class DataUtils {
    private static Faker faker;

    public static DataUtils getData() {
        return new DataUtils();
    }

    private DataUtils() {
        faker = new Faker();
    }

    public static String getFirtName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getEmailAddress() {
        return faker.internet().emailAddress();
    }

    public static String getFirstNameAddress() {
        return faker.address().firstName();
    }

    public static String getPhoneNumber() {
        return String.valueOf(faker.number().numberBetween(10000000, 999999999));
    }

    public static String getCity() {
        return faker.address().city();
    }

    public static String getRandomDOB() {
        String dob = faker.date().birthday().toString();
        return dob.toString();
    }

    public static String getPassword() {
        return faker.internet().password();
    }

    public static String getPin() {
        return String.valueOf(faker.number().numberBetween(100000, 999999));

    }


}
