package N11Test;
import Base.Setup;
import N11Pages.N11UyeolPage;
import org.testng.annotations.Test;
import N11Pages.AnasayfaPage;
import N11Pages.AramaSonucPage;
import N11Pages.N11AnasayfaPage;

public class N11KayıtOlmaİslemi
{
    //public WebDriver driver;
    @Test
    public void siteyiac() throws InterruptedException
    {
        Setup a= new Setup();
        a.Websiteopen();
        AnasayfaPage anasayfaPage = new AnasayfaPage();
        anasayfaPage
                .anasayfaboslukdoldur("n11.com")
                .aramayap();




        AramaSonucPage aramaSonucPage =new AramaSonucPage();

        aramaSonucPage
                .n11sitesinegir();




        N11AnasayfaPage n11AnasayfaPage = new N11AnasayfaPage();

        n11AnasayfaPage.hesabimabas()
                .uyeolabas();


        N11UyeolPage n11UyeolPage = new N11UyeolPage();

        n11UyeolPage
                .adgir("Batuhan")
                .soyadgir("Kılıçoğlu")
                .epostagir("optiimdeneme@gmail.com")
                .sifregir("13271327")
                .sifregirtekrar("13271327")
                .ceptelefonugir("05550354314")
                .cinsiyetsec()
                .dogumgunugir("12")
                .dogumayigir("Ocak")
                .dogumyiligir("2000")
                .sozlesmekabulet()
                .uyeolbutonunabas();








    }
}