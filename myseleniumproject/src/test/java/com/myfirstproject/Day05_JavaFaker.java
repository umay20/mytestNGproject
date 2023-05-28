package com.myfirstproject;
import com.github.javafaker.Faker;
import org.junit.Test;
public class Day05_JavaFaker {
    /*
    data : username, password, phone number, test environment, city, ssn, url, job title,..
    -Where do you get your test data in your company?
    ---BA - Business Analyst : writes the Acceptance criteria or requirement
    ---Test Lead
    ---Manual Tester
    ---Tech Lead(Team Lead)
    ---PO - maintains product backlog
    ---Developers
    ---from the database
    ---from API calls
    in addition to all these, we can use java faker if we need some fake data
     */
    @Test
    public void javaFaker(){
//        1. Create a Faker object
        Faker faker = new Faker();
//        2. user faker object or generate fake test data
        String firstName = faker.name().firstName();
        System.out.println(firstName);
//        last name
        System.out.println(faker.name().lastName());
//        title
        System.out.println(faker.name().title());
//        city
        System.out.println(faker.address().city());
//        state
        System.out.println("State : "+faker.address().state());
//        country
        System.out.println("Country : "+faker.address().country());
//        address
        System.out.println("Full address : "+faker.address().fullAddress());
//        zip code
        System.out.println("Zip code : "+faker.address().zipCode());
//        random number : 10 digit number
        System.out.println(faker.number().digits(10));
//        cell phone number
        System.out.println(faker.phoneNumber().cellPhone());
//        ssn
        System.out.println(faker.idNumber().ssnValid());
//        email
        System.out.println(faker.internet().emailAddress());
//        birthday
        System.out.println(faker.date().birthday());
    }
}