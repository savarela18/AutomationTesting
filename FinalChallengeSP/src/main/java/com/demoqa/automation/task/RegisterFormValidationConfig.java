package com.demoqa.automation.task;

import com.demoqa.automation.questions.Validation;
import com.demoqa.automation.ui.RegisterFormPage;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.SpecialMethods;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.JavaScript;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterFormValidationConfig implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();

        actor.should(

                seeThat(Validation.in(RegisterFormPage.FULL_NAME_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("firstname") + " " +(SpecialMethods.properties.getProperty("lastname")))),
                seeThat(Validation.in(RegisterFormPage.EMAIL_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("email"))),
                seeThat(Validation.in(RegisterFormPage.GENDER_RADIO_BUTTON_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("gender"))),
                seeThat(Validation.in(RegisterFormPage.BIRTH_DATE_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("birthday"))),
                seeThat(Validation.in(RegisterFormPage.PHONE_NUMBER_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("number"))),
                seeThat(Validation.in(RegisterFormPage.SUBJECT_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("subject"))),
                seeThat(Validation.in(RegisterFormPage.HOBBIES_CHECK_BOX_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("hobbies"))),
                seeThat(Validation.in(RegisterFormPage.UPLOAD_IMAGE_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("filename"))),
                seeThat(Validation.in(RegisterFormPage.CURRENT_ADDRESS_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("address"))),
                seeThat(Validation.in(RegisterFormPage.STATE_CITY_INPUT_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("state") + " " + SpecialMethods.properties.getProperty("city")))

        );

    }

    public static RegisterFormValidationConfig ValidationConfig (){

        return instrumented(RegisterFormValidationConfig.class);
    }
}
