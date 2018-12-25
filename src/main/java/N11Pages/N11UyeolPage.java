package N11Pages;

import Base.Setup;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.xml.bind.Element;
import javax.xml.stream.Location;
import java.awt.*;
import java.util.List;


public class N11UyeolPage {

    public WebDriver driver;

    public N11UyeolPage() {
        this.driver = new Setup().getDriver();
    }

    @Step("Adını Gir")
    public N11UyeolPage adgir(String ad) {
        driver.findElement(By.id("firstName")).sendKeys(ad);
        return this;

    }


    @Step("Soyadını Gir")
    public N11UyeolPage soyadgir(String soyad) {
        driver.findElement(By.id("lastName")).sendKeys(soyad);
        return this;

    }


    @Step("Mail Adresini Gir")
    public N11UyeolPage epostagir(String email) {
        driver.findElement(By.id("registrationEmail")).sendKeys(email);
        return this;

    }


    @Step("Sifreni Gir")
    public N11UyeolPage sifregir(String sifre) {
        driver.findElement(By.id("registrationPassword")).sendKeys(sifre);
        return this;

    }


    @Step("Sifreni Tekrar Gir")
    public N11UyeolPage sifregirtekrar(String sifretekrari) {
        driver.findElement(By.id("passwordAgain")).sendKeys(sifretekrari);
        return this;

    }


    @Step("Telefonunu Gir ")
    public N11UyeolPage ceptelefonugir(String ceptelefonu) {
        driver.findElement(By.id("phoneNumber")).sendKeys(ceptelefonu);
        return this;

    }

    @Step("Cinsiyeti Erkek Olarak Seç")
    public N11UyeolPage cinsiyetsec() {
        driver.findElement(By.cssSelector("[for='genderMale']")).click();
        return  this;
    }

    @Step("Doğum Gününü Gir")
    public N11UyeolPage dogumgunugir(String dogumgunu) {
        //driver.findElement(By.id("birthDay")).click();
        driver.findElement(By.id("birthDay")).sendKeys(dogumgunu);

        return  this;
    }


    @Step("Doğum Ayını Gir")
    public N11UyeolPage dogumayigir(String dogumayi) {
        //driver.findElement(By.id("birthDay")).click();
        driver.findElement(By.id("birthMonth")).sendKeys(dogumayi);

        return  this;
    }



    @Step("Doğum Yılıı Gir")
    public N11UyeolPage dogumyiligir(String dogumyili) {
        //driver.findElement(By.id("birthDay")).click();
        driver.findElement(By.id("birthYear")).sendKeys(dogumyili);

        return  this;
    }


    @Step("Sözleşmeyi Kabulet CheckBox'ına Tıkla ")
    public N11UyeolPage sozlesmekabulet() {

        WebElement chk =
                driver.findElement(By.cssSelector("[class='inputfield buyerAgreement '] a"));

        Actions ac = new Actions(driver);
        ac.moveToElement(chk).moveByOffset(-(chk.getSize().width/2)-5,0).click().perform();


        return  this;
    }

    @Step("Uye ol Butonuna Bas")
    public N11UyeolPage uyeolbutonunabas() {
        driver.findElement(By.id("submitButton")).click();

        return  this;
    }

    @Step("İsmini Gir")
    public N11UyeolPage isimalaninidoldur(String isimgir) {
        driver.findElement(By.cssSelector("#u_0_j")).sendKeys(isimgir);

        return  this;
    }

    @Step("Soyismini Gir")
    public N11UyeolPage facebookadinidoldur(String soyisimgir) {
        driver.findElement(By.cssSelector("#u_0_j")).sendKeys(soyisimgir);

        return  this;
    }







}
