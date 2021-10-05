package gmiBank.pages;

import gmiBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastname")
    public WebElement lastNameTextBox;

    @FindBy(id = "address")
    public WebElement adressTextBox;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneNumberTextBox;

    @FindBy(id = "username")
    public WebElement userNameRegistrationTextBox;

    @FindBy(id = "email")
    public WebElement eMailTextBox;

    @FindBy(id = "firstPassword")
    public WebElement newPasswordTextBox;

    @FindBy(xpath = "//div[9]//ul//li[5]")
    public WebElement passwordStrenghtBox;

    @FindBy(id = "secondPassword")
    public WebElement newPasswordConfirmTextBox;

    @FindBy(id = "register-submit")
    public WebElement registerBtn;

    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement successfulRegisterMessage;

    @FindBy(xpath = "//*[text()='Failed to sign in!']")
    public WebElement failedRegisterMessage;

}
