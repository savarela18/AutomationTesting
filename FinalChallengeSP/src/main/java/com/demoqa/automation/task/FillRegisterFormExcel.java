package com.demoqa.automation.task;
import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.RegisterFormPage;
import com.demoqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillRegisterFormExcel implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {


    actor.attemptsTo(
            JavaScriptClick.on(RegisterFormPage.CLOSE_ADD_BUTTON),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,0)).into(RegisterFormPage.FIRST_NAME_INPUT),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,1)).into(RegisterFormPage.LAST_NAME_INPUT),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,2)).into(RegisterFormPage.EMAIL_INPUT),
            JavaScriptClick.on(RegisterFormPage.GENDER_RADIO_BUTTON),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,3)).into(RegisterFormPage.PHONE_NUMBER_INPUT),
            Enter.keyValues(Keys.chord(Keys.CONTROL +"a"),Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,4)).into(RegisterFormPage.BIRTH_DATE_INPUT),
            Enter.keyValues(Keys.ENTER).into(RegisterFormPage.BIRTH_DATE_INPUT),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,5)).into(RegisterFormPage.SUBJECT_INPUT),
            Enter.keyValues(Keys.ENTER).into(RegisterFormPage.SUBJECT_INPUT),
            JavaScriptClick.on(RegisterFormPage.HOBBIES_CHECK_BOX),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,6)).into(RegisterFormPage.UPLOAD_IMAGE_BUTTON),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,7)).into(RegisterFormPage.CURRENT_ADDRESS_INPUT),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,8),Keys.ENTER).into(RegisterFormPage.STATE_INPUT),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,9),Keys.ENTER).into(RegisterFormPage.CITY_INPUT),
            JavaScriptClick.on(RegisterFormPage.SUBMIT_BUTTON)
    );


    }

    public static FillRegisterFormExcel FillFormExcel(){

        return instrumented(FillRegisterFormExcel.class);
    }
}
