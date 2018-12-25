package MonsterNotebookTest;

import Base.Setup;
import N11Pages.AnasayfaPage;
import N11Pages.AramaSonucPage;
import org.testng.annotations.Test;

public class MNotebookOzellestir {

    @Test
    public void siteyiac() throws InterruptedException {
        Setup a = new Setup();
        a.Websiteopen();
        AnasayfaPage anasayfaPage = new AnasayfaPage();


        anasayfaPage
                .anasayfaboslukdoldur("MonsterNotebook")
                .aramayap();

        AramaSonucPage aramaSonucPage = new AramaSonucPage();


        aramaSonucPage
                .monstersitesinegir();



    }

}
