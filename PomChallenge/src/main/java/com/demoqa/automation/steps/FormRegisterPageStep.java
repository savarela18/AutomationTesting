package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.FormRegisterPage;
import com.demoqa.automation.utils.Javascript;
import net.thucydides.core.annotations.Step;
import java.util.concurrent.TimeUnit;


public class FormRegisterPageStep {
    FormRegisterPage formRegisterPage = new FormRegisterPage();
    DataInjection dataInjection = new DataInjection();


    @Step
    public void openBrowser(){formRegisterPage.open();}
    @Step
    public void FillFormRegisterPage() throws Exception {
        formRegisterPage.getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        formRegisterPage.sendFirstNameInput(dataInjection.getName());
        formRegisterPage.sendLastNameInput(dataInjection.getLastname());
        formRegisterPage.sendUserEmailInput(dataInjection.getEmail());
        Javascript.clickJS(formRegisterPage.getDriver(),formRegisterPage.genderRatioClick);
        formRegisterPage.sendUserNumberInput(dataInjection.getPhoneNumber());
        formRegisterPage.sendDateOfBirthInput(dataInjection.getBirthday());
        formRegisterPage.sendSubjectsContainerInput(dataInjection.getSubjects());
        Javascript.clickJS(formRegisterPage.getDriver(),formRegisterPage.hobbiesCheckCLick);
        formRegisterPage.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        formRegisterPage.setUploadPictureClick(dataInjection.getUploadFile());
        formRegisterPage.sendCurrentAddressInput(dataInjection.getAddress());
        formRegisterPage.sendStateInput(dataInjection.getState());
        formRegisterPage.sendCityInput(dataInjection.getCity());
        Javascript.clickJS(formRegisterPage.getDriver(), formRegisterPage.submitClick);


    }

    @Step
    public void Validation(){
        formRegisterPage.Validations(
                dataInjection.getName() +" "+ dataInjection.getLastname(),
                dataInjection.getEmail(),dataInjection.getGender(), dataInjection.getPhoneNumber(),
                dataInjection.getBirthday(),dataInjection.getSubjects(),dataInjection.getHobbiesValidation(),
                dataInjection.getFile(), dataInjection.getAddress(), dataInjection.getState() +" "+dataInjection.getCity()
                );

    }
}
