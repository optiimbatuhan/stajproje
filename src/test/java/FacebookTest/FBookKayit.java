package FacebookTest;

import Base.Setup;
import N11Pages.AnasayfaPage;
import N11Pages.AramaSonucPage;
import N11Pages.N11UyeolPage;
import org.testng.annotations.Test;

public class FBookKayit {


    @Test
    public void siteyiac() throws InterruptedException {
        Setup a = new Setup();
        a.Websiteopen();
        AnasayfaPage anasayfaPage = new AnasayfaPage();


        anasayfaPage
                .anasayfaboslukdoldur("Facebook")
                .aramayap();

        AramaSonucPage aramaSonucPage = new AramaSonucPage();


        aramaSonucPage
                .facebooksitesinegir();

        N11UyeolPage n11UyeolPage = new N11UyeolPage();

        n11UyeolPage
                .facebookadinidoldur("Batuhan");

}
}
