package com.demoqa.automation.task;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.RegisterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FillRegisterFormFaker implements Task {
    DataInjection dataInjection = new DataInjection();


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                JavaScriptClick.on(RegisterFormPage.CLOSE_ADD_BUTTON),
                Enter.theValue(dataInjection.getName()).into(RegisterFormPage.FIRST_NAME_INPUT),
                Enter.theValue(dataInjection.getLastname()).into(RegisterFormPage.LAST_NAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(RegisterFormPage.EMAIL_INPUT),
                JavaScriptClick.on(RegisterFormPage.GENDER_RADIO_BUTTON),
                Enter.theValue(dataInjection.getPhoneNumber()).into(RegisterFormPage.PHONE_NUMBER_INPUT),
                Enter.keyValues(Keys.chord(Keys.CONTROL+"a"),dataInjection.getBirthday(),Keys.ENTER).into(RegisterFormPage.BIRTH_DATE_INPUT),
                Enter.keyValues(dataInjection.getSubjects()).into(RegisterFormPage.SUBJECT_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.SUBJECT_INPUT),
                JavaScriptClick.on(RegisterFormPage.HOBBIES_CHECK_BOX),
                Enter.keyValues(dataInjection.getUploadFile()).into(RegisterFormPage.UPLOAD_IMAGE_BUTTON),
                Enter.theValue(dataInjection.getAddress()).into(RegisterFormPage.CURRENT_ADDRESS_INPUT),
                Enter.theValue(dataInjection.getState(),Keys.ENTER).into(RegisterFormPage.STATE_INPUT),
                Enter.theValue(dataInjection.getCity(),Keys.ENTER).into(RegisterFormPage.CITY_INPUT),
                JavaScriptClick.on(RegisterFormPage.SUBMIT_BUTTON)

        );



    }
    public static FillRegisterFormFaker FillFormFaker(){

        return instrumented(FillRegisterFormFaker.class);
    }
}
