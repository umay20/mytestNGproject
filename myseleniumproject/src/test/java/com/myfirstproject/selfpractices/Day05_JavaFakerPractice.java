package com.myfirstproject.selfpractices;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFakerPractice {

    @Test
    public void javaFaker(){
        //create faker object
        Faker faker=new Faker();

        //1.user faker object or generate fake test data
        String firstName=faker.name().firstName();
        System.out.println(firstName);

        //2.generate fake lastname(yukardaki gibi container icine ya da asagidaki gibi sout icinde kod calisir)

        System.out.println(faker.name().lastName());

        //3.generate title
        System.out.println(faker.name().title());

        //4.generate city
        System.out.println(faker.address().city());
        //5.state
        System.out.println("State:"+faker.address().state());
        //6.country
        System.out.println("Country:"+faker.address().country());
        //7.address
        System.out.println("Full Address:"+faker.address().fullAddress());
        //8.zipcode
        System.out.println("Zipcode:"+faker.address().zipCode());
        //9.random number: 10 digit number
        System.out.println("Random 10 digit Number:"+faker.number().digits(10));
        //10.cell phone number
        System.out.println("Cell Phone :"+faker.phoneNumber().cellPhone());
        //ssn
        System.out.println(faker.idNumber().ssnValid());
        //e-mail
        System.out.println(faker.internet().emailAddress());
        //date
        System.out.println("random date/birthday:"+faker.date().birthday());



    }
}
