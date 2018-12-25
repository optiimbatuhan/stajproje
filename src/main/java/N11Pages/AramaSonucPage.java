package N11Pages;

import Base.Setup;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AramaSonucPage extends AnasayfaPage {

    public WebDriver driver;

    public AramaSonucPage(){
        this.driver=new Setup().getDriver();
    }

    @Step("N11 Sitesine Gir")
    public AramaSonucPage n11sitesinegir (){
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3")).click();
        return this;
    }

    @Step("Monster Notebook Sitesine Gir")
    public AramaSonucPage monstersitesinegir (){
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3")).click();
        return this;
    }

    @Step("Facebook Sitesine Gir")
    public AramaSonucPage facebooksitesinegir (){
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3")).click();
        return this;
    }













}
