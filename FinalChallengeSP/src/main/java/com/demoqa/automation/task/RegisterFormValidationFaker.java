package com.demoqa.automation.task;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.questions.PresenceElements;
import com.demoqa.automation.questions.Validation;
import com.demoqa.automation.ui.RegisterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterFormValidationFaker implements Task {

    DataInjection dataInjection = new DataInjection();


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(

                seeThat(PresenceElements.visible(RegisterFormPage.SUBMIT_FORM_VALIDATION)),
                seeThat(Validation.in(RegisterFormPage.SUBMIT_FORM_TEXT_VALIDATION),equalToIgnoringCase(dataInjection.getSubmitFormText())),
                seeThat(Validation.in(RegisterFormPage.UPLOAD_IMAGE_INPUT_VALIDATION),equalToIgnoringCase(dataInjection.getFile())),
                seeThat(Validation.in(RegisterFormPage.HOBBIES_CHECK_BOX_VALIDATION),equalToIgnoringCase(dataInjection.getHobbiesValidation())),
                seeThat(Validation.in(RegisterFormPage.GENDER_RADIO_BUTTON_VALIDATION),equalToIgnoringCase(dataInjection.getGenderValidation())),
                seeThat(Validation.in(RegisterFormPage.BIRTH_DATE_INPUT_VALIDATION),equalToIgnoringCase(dataInjection.getBirthday()))

        );
    }
    public static RegisterFormValidationFaker validationFaker (){
        return instrumented(RegisterFormValidationFaker.class);
    }
}
