package com.demoqa.automation.task;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.questions.Validation;
import com.demoqa.automation.ui.RegisterFormPage;
import com.demoqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterFormValidationExcel implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.should(

                seeThat(Validation.in(RegisterFormPage.FULL_NAME_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,0))),
                seeThat(Validation.in(RegisterFormPage.EMAIL_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,1))),
                seeThat(Validation.in(RegisterFormPage.GENDER_RADIO_BUTTON_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,2))),
                seeThat(Validation.in(RegisterFormPage.PHONE_NUMBER_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,3))),
                seeThat(Validation.in(RegisterFormPage.BIRTH_DATE_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,4))),
                seeThat(Validation.in(RegisterFormPage.SUBJECT_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,5))),
                seeThat(Validation.in(RegisterFormPage.HOBBIES_CHECK_BOX_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,6))),
                seeThat(Validation.in(RegisterFormPage.UPLOAD_IMAGE_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,7))),
                seeThat(Validation.in(RegisterFormPage.CURRENT_ADDRESS_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,8))),
                seeThat(Validation.in(RegisterFormPage.STATE_CITY_INPUT_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getValidationSheet(),0,9)))

        );

    }

    public static RegisterFormValidationExcel validationExcel(){
        return instrumented(RegisterFormValidationExcel.class);
    }
}
