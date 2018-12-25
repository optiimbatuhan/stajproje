package Base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup {

    public  static WebDriver driver;

    @Step("Google Girişi")
    public  void Websiteopen()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

   // public Setup(WebDriver driver)
    //{

     //   this.driver=driver;
    //}
    public Setup()
    {
    }
    public WebDriver getDriver()
    {
        return this.driver;
    }

}