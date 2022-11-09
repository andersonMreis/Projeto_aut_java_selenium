package br.com.buscape.steps;

import br.com.buscape.pages.SmartphonesPage;
import org.junit.Test;

public class
SmartphonesSteps extends BaseSteps {
    SmartphonesPage smartphonesPage = new SmartphonesPage();
    @Test
    public void buscarSmartphone(){
        smartphonesPage.setEscreverNomeDoSmartphone("Smartphone iphone13");
        smartphonesPage.setClicarNoSmartphone();
        smartphonesPage.setIphone13();
        smartphonesPage.setClicarBtnConcordar();
        smartphonesPage.setClicarBtMenorPreco();

    }

}
