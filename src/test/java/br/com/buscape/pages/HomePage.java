package br.com.buscape.pages;


import org.openqa.selenium.By;

public class
HomePage extends BasePage {

    private static final By campoBuscape = new By.ByCssSelector("[placeholder=\"Digite sua busca...\"]");
    private static final By btnPequisaBuscape  = new By.ByCssSelector("button[class=\"AutoCompleteStyle_submitButton_" +
            "_2Zijr\"]");
    private static final By buscarResultado = new By.ByCssSelector("[data-testid=\"content::title\"]");
    private static final By escreverBusca = new By.ByCssSelector("[placeholder=\"Digite sua busca...\"]");
    private static final By clicarCashback = new By.ByCssSelector("[class=\"Text_Text__VJDNU Text_LabelSmRegular_" +
            "_qvxsr ButtonWithIcon_Label__H5xe9\"]:nth-child(1)");
    private static final By validarCashback = new By.ByCssSelector("#__next > main > div:nth-child(2) > " +
            "div > div > h1");
    private static final By clickCuponsDesconto = new By.ByCssSelector("#new-header > div.new-zheader.DoubleHeader_" +
            "new-zheader__AmjXA.DoubleHeader_second-line__qIShd > div > div > div.DoubleHeader_second-column_" +
            "_OFGbE.col > nav > ul > li:nth-child(2) > a");
    private static final By clickDicasBusca = new By.ByCssSelector("#new-header > div.new-zheader.DoubleHeader_new-" +
            "zheader__AmjXA.DoubleHeader_second-line__qIShd > div > div > div.DoubleHeader_second-column__OFGbE.col >" +
            " nav > ul > li:nth-child(3) > a > span.Text_Text__VJDNU.Text_LabelSmRegular__qvxsr.ButtonWithIcon_" +
            "Label__H5xe9");
    public void setEscreverNoCampoBuscape(String pesquisar){sendKeys(campoBuscape, pesquisar);}
    public void setClicarButaoPesquisa(){click(btnPequisaBuscape);}
    public String getTextResutadoPesquisa() {return lerText(buscarResultado);}
    public void setLimpar(){limparCampo(escreverBusca);}
    public void setClicarCashback(){ click(clicarCashback);}
    public String getValidarCashback(){ return lerText(validarCashback);}
    public void setClickDicasBusca(){ click(clickDicasBusca);}
    public void setCuponsDesconto(){ click(clickCuponsDesconto);}





}



