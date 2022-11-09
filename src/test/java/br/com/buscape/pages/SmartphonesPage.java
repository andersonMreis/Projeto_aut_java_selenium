package br.com.buscape.pages;

import org.openqa.selenium.By;

public class SmartphonesPage extends BasePage {

    private static final  By buscarIte = new By.ByCssSelector("[placeholder=\"Digite sua busca...\"]");
    private static final By btnBuscarSmartphone  = new By.ByCssSelector("button[class=\"AutoCompleteStyle_" +
            "submitButton__2Zijr\"]");
    private static final By btnSelecionarItem  = new By.ByCssSelector("a[href=\"/celular/pre-venda-smartphone-apple-" +
            "iphone-13-128gb-ios?_lc=88&searchterm=Smartphone%20iphone13\"]");
    private static final By btnConcordar  = new By.ByCssSelector("[class=\"Button_button__cW0_w Button_system__o30ON" +
            " Button_outline__2biD1 PrivacyPolicy_Button__Nt58L\"]");
    private static final By btnMenorPreco = new By.ByCssSelector("[class=\"Text_Text__bOTfK Text_MobileLabelS__rf5R4" +
            " Price_Merchant__EUdHA\"]");
    public void setEscreverNomeDoSmartphone(String pesquisar){ sendKeys(buscarIte, pesquisar);}
    public void setClicarNoSmartphone(){ click(btnBuscarSmartphone);}
    public void setIphone13(){ click(btnSelecionarItem);}
    public void setClicarBtnConcordar(){ click(btnConcordar);}
    public void setClicarBtMenorPreco(){ click(btnMenorPreco);}


}
