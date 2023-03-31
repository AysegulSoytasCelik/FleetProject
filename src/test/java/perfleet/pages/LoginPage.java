package perfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import perfleet.utilities.ConfigurationReader;
import perfleet.utilities.Driver;


public class LoginPage extends BasePage{


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------> LOCATORS <------------------------
    @FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id = "_submit")
    public WebElement loginButton;


    @FindBy(xpath = "//h2[.='Login']")
    public WebElement loginPageTitle;









}
