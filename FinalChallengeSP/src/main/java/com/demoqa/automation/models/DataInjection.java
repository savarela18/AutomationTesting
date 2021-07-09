package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    //ExcelDataInfo
    private String filepathExcel,InformationNameSheet , validationSheet;

    //DataInjection
    private String name;
    private String lastname;
    private String email;
    private String birthday;
    private String phoneNumber;
    private String subjects;
    private String filepath;
    private String uploadFile;
    private String address;
    private String state;
    private String city;

    //Validation Variables
    private String file;
    private String genderValidation;
    private String hobbiesValidation;
    private String SubmitFormText;

    //ScreenShot PathInfo
    private String DestPath,ScrName;


    public String getFilepathExcel() {
        return filepathExcel;
    }

    public String getInformationNameSheet() {
        return InformationNameSheet;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getUploadFile() {
        return uploadFile;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getFile() {
        return file;
    }

    public String getSubmitFormText() {
        return SubmitFormText;
    }

    public String getGenderValidation() {
        return genderValidation;
    }

    public String getHobbiesValidation() {
        return hobbiesValidation;
    }

    public String getValidationSheet() {
        return validationSheet;
    }

    public String getDestPath() {
        return DestPath;
    }

    public String getScrName() {
        return ScrName;
    }

    public DataInjection(){

        //DataInjection
        this.name = faker.name().firstName();
        this.lastname = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.phoneNumber = Long.toString(faker.number().randomNumber(10,true));
        this.filepath="C:\\RobotConfig\\UploadPictures\\";
        this.file = "Faker.png";
        this.uploadFile=filepath+file;
        this.birthday = "19 September,1998";
        this.subjects = "Computer Science";
        this.address = faker.address().fullAddress();
        this.state = "NCR";
        this.city = "Noida";

        //Validation Data
        this.hobbiesValidation = "Music";
        this.genderValidation = "Male";
        this.SubmitFormText = "Thanks for submitting the form";


        //Excel Info
        this.filepathExcel = "C:\\RobotConfig\\Data\\DataInfo.xlsx";
        this.InformationNameSheet ="InformationData";
        this.validationSheet = "ValidationData";

        //Screenshot Info
        this.DestPath = "C:\\RobotConfig\\Evidences\\";
        this.ScrName = "Evidence.jpg";
    }
}
