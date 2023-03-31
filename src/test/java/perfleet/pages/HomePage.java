package perfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import perfleet.utilities.Driver;
import perfleet.utilities.BrowserUtils;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement quickLaunchpad;


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id='login-form']/fieldset/div[1]/div")
    public WebElement invalidUsernameOrPassword;


    @FindBy(css = "li a.dropdown-toggle")
    public WebElement userProfile;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

}
