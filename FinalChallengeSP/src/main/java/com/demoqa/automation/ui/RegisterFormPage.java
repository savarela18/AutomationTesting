package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class RegisterFormPage {

    //FORM
    public static String URL = "https://www.demoqa.com/automation-practice-form";
    public static final Target FIRST_NAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_RADIO_BUTTON = Target.the("").located(By.id("gender-radio-1"));
    public static final Target PHONE_NUMBER_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target BIRTH_DATE_INPUT = Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target SUBJECT_INPUT = Target.the("").located(By.id("subjectsInput"));
    public static final Target HOBBIES_CHECK_BOX = Target.the("").located(By.id("hobbies-checkbox-3"));
    public static final Target UPLOAD_IMAGE_BUTTON = Target.the("").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public static final Target STATE_INPUT = Target.the("").located(By.id("react-select-3-input"));
    public static final Target CITY_INPUT = Target.the("").located(By.id("react-select-4-input"));
    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));
    public static final Target CLOSE_ADD_BUTTON = Target.the("").located(By.id("close-fixedban"));

    //DATA VERIFICATION FORM
    public static final Target FULL_NAME_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[2]");
    public static final Target EMAIL_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[4]");
    public static final Target GENDER_RADIO_BUTTON_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[6]");
    public static final Target PHONE_NUMBER_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[8]");
    public static final Target BIRTH_DATE_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[10]");
    public static final Target SUBJECT_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[12]");
    public static final Target HOBBIES_CHECK_BOX_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[14]");
    public static final Target UPLOAD_IMAGE_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[16]");
    public static final Target CURRENT_ADDRESS_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[18]");
    public static final Target STATE_CITY_INPUT_VALIDATION = Target.the("").locatedBy("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[20]");
    public static final Target SUBMIT_FORM_VALIDATION = Target.the("").locatedBy("//*[@class='modal-content']");
    public static final Target SUBMIT_FORM_TEXT_VALIDATION = Target.the("").located(By.id("example-modal-sizes-title-lg"));
}
