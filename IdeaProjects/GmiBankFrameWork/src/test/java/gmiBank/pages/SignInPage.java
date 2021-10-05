package gmiBank.pages;

import gmiBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[text()='Sign in'][1]")
    public WebElement signInBtn;
    //  //*[text()='Sign in']

    @FindBy(partialLinkText = "Cancel")
    public WebElement cancelBtn;

    @FindBy(xpath = "//*[span='My Operations']")
    public WebElement myOperations;


}
