package gmiBank.pages;

import gmiBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement iconAccountMenu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement SignInhomePage;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement RegisterhomePage;
}
