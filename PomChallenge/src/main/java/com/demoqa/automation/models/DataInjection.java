package com.demoqa.automation.models;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));

    private String name;
    private String lastname;
    private String email;
    private String birthday;
    private String phoneNumber;
    private String subjects;
    private String filepath;
    private String file;
    private String uploadFile;
    private String address;
    private String state;
    private String city;
    private String genderValidation;
    private String hobbiesValidation;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return genderValidation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getUploadFile() {
        return uploadFile;
    }

    public String getFile() {
        return file;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getHobbiesValidation() {
        return hobbiesValidation;
    }

    public String getCity() {
        return city;
    }

    public DataInjection(){
        this.name = faker.name().firstName();
        this.lastname = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.genderValidation = "Male";
        this.phoneNumber = Long.toString(faker.number().randomNumber(10,true));
        this.filepath="c:\\";
        this.file = "test.png";
        this.uploadFile=filepath+file;
        this.birthday = "19 March,2000";
        this.hobbiesValidation = "Music";
        this.subjects = "Maths";
        this.address = faker.address().fullAddress();
        this.state = "NCR";
        this.city = "Noida";

    }
}
