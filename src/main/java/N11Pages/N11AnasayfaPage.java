package N11Pages;

import Base.Setup;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class N11AnasayfaPage {
    public WebDriver driver;

    public N11AnasayfaPage(){
        this.driver=new Setup().getDriver();
    }
    @Step("Hesabıma Bas")
    public N11AnasayfaPage hesabimabas () {
        driver.findElement(By.cssSelector("#header > div > div > div.hMedMenu > div.customMenu > div.myAccountHolder.customMenuItem.withLocalization > div > a")).click();
        return this;

    }


        @Step("Üye Ol'a Bas")
        public N11AnasayfaPage uyeolabas (){
            driver.findElement(By.cssSelector("#loginContainer > div > div.rightBlock > div > div > div > a")).click();
            return this;


    }
}
