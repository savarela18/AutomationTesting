package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.RegisterUserPage;
import com.demoqa.automation.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class RegisterNewUserPageStep {

    RegisterUserPage registerUserPage = new RegisterUserPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void OpenBrowser (){
        registerUserPage.open();
    }

    @Step
    public void FillTheRequiredInfo(){
        registerUserPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        registerUserPage.clickAddNewRecordButton();
        registerUserPage.sendFirstNameInput(dataInjection.getName());
        registerUserPage.sendLastNameInput(dataInjection.getLastName());
        registerUserPage.sendUserEmailInput(dataInjection.getEmail());
        registerUserPage.sendAgeInput(dataInjection.getAge());
        registerUserPage.sendSalaryInput(dataInjection.getSalary());
        registerUserPage.sendDepartmentInput(dataInjection.getDepartment());
        registerUserPage.clickSubmitButton();
    }
    @Step
    public void Validations(){
        registerUserPage.Validations(dataInjection.getName(),dataInjection.getLastName(),dataInjection.getAge(),
                dataInjection.getEmail(), dataInjection.getSalary(),dataInjection.getDepartment());

    }

    @Step
    public void FillTheInfoWithExcel(){
        registerUserPage.clickAddNewRecordButton();
        registerUserPage.sendFirstNameInput(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,0));
        registerUserPage.sendLastNameInput(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,1));
        registerUserPage.sendUserEmailInput(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,2));
        registerUserPage.sendAgeInput(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,3));
        registerUserPage.sendSalaryInput(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,4));
        registerUserPage.sendDepartmentInput(Excel.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getInformationNameSheet(),0,5));
        registerUserPage.clickSubmitButton();
    }

    @Step
    public void ValidationsWithExcel(){
        registerUserPage.Validations(Excel.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getValidationSheet(),0,0),
                Excel.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getValidationSheet(),0,1),
                Excel.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getValidationSheet(),0,2),
                Excel.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getValidationSheet(),0,3),
                Excel.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getValidationSheet(),0,4),
                Excel.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getValidationSheet(),0,5));

    }
}
