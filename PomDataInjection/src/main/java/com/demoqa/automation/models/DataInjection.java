package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String name;
    private String lastName;
    private String Email;
    private String age;
    private String Salary;
    private String Department;

    //ExcelDataInfo
    private String filepathExcel,InformationNameSheet , validationSheet;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public String getFilepathExcel() {
        return filepathExcel;
    }

    public String getInformationNameSheet() {
        return InformationNameSheet;
    }

    public String getValidationSheet() {
        return validationSheet;
    }

    public DataInjection(){
        this.name = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.Email = faker.internet().emailAddress();
        this.age = Integer.toString(faker.number().numberBetween(15,80));
        this.Salary = Integer.toString(faker.number().numberBetween(1000000,3000000));
        this.Department = faker.job().position();
        this.filepathExcel = "resources/Datainfo.xlsx";
        this.InformationNameSheet = "Data";
        this.validationSheet = "Validation";
    }
}
