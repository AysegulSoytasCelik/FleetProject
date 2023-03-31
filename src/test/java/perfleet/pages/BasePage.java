package perfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import perfleet.utilities.BrowserUtils;
import perfleet.utilities.Driver;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='loader-mask']")  //xpath = "//div[@class='loader-mask loader']"
    @CacheLookup
    protected WebElement loaderMask;

    public String pageTitle(){

        BrowserUtils.sleep(3);
        return Driver.getDriver().getTitle();

    }

    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

        class BrowserUtils {

            public  void sleep(int second) {
                second *= 1000;
                try {
                    Thread.sleep(second);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
