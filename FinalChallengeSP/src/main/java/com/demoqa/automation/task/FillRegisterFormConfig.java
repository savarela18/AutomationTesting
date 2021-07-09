package com.demoqa.automation.task;

import com.demoqa.automation.ui.RegisterFormPage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillRegisterFormConfig implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();

        actor.attemptsTo(
                JavaScriptClick.on(RegisterFormPage.CLOSE_ADD_BUTTON),
                Enter.theValue(SpecialMethods.properties.getProperty("firstname")).into(RegisterFormPage.FIRST_NAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("lastname")).into(RegisterFormPage.LAST_NAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("email")).into(RegisterFormPage.EMAIL_INPUT),
                JavaScriptClick.on(RegisterFormPage.GENDER_RADIO_BUTTON),
                Enter.theValue(SpecialMethods.properties.getProperty("number")).into(RegisterFormPage.PHONE_NUMBER_INPUT),
                Enter.keyValues(Keys.chord(Keys.CONTROL+"a"),SpecialMethods.properties.getProperty("birthday"),Keys.ENTER).into(RegisterFormPage.BIRTH_DATE_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("subject")).into(RegisterFormPage.SUBJECT_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.SUBJECT_INPUT),
                JavaScriptClick.on(RegisterFormPage.HOBBIES_CHECK_BOX),
                Enter.keyValues(SpecialMethods.properties.getProperty("path")+SpecialMethods.properties.getProperty("filename")).into(RegisterFormPage.UPLOAD_IMAGE_BUTTON),
                Enter.theValue(SpecialMethods.properties.getProperty("address")).into(RegisterFormPage.CURRENT_ADDRESS_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("state"),Keys.ENTER).into(RegisterFormPage.STATE_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("city"),Keys.ENTER).into(RegisterFormPage.CITY_INPUT),
                JavaScriptClick.on(RegisterFormPage.SUBMIT_BUTTON)

        );
    }

    public static FillRegisterFormConfig fillFormConfig(){
        return instrumented(FillRegisterFormConfig.class);
    }
}
