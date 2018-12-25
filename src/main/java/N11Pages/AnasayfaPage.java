package N11Pages;

import Base.Setup;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnasayfaPage {

    public WebDriver driver;

    public AnasayfaPage(){
        this.driver=new Setup().getDriver();
    }

    @Step("Arama Kısmını Doldurma")
    public AnasayfaPage anasayfaboslukdoldur(String aramacubugudoldur){
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(aramacubugudoldur);
        return this;
    }

    @Step("Ara Butonuna Bas")
    public AnasayfaPage aramayap(){
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]")).click();

        return this;
    }

   /*


    @Step("Login Butonuna Bas")
    public AnasayfaPage loginbutonunabas(){
        driver.findElement(By.id("login-form:login")).click();
        return this;
    }


    @Step("Details Butonuna Bas")
    public AnasayfaPage detailsbutonunabas(){
        driver.findElement(By.id("logout-form:details")).click();
        return this;
    }


*/











}
