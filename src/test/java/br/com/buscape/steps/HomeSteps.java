package br.com.buscape.steps;

import br.com.buscape.pages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps{

    //instâncias
    HomePage homePage = new HomePage();

    @Test
    public void pesquisarUmNomeExistenteNoCampoBuscape(){
        homePage.setEscreverNoCampoBuscape("Samsung Galaxy A");
        homePage.setLimpar();
        homePage.setEscreverNoCampoBuscape("Smartphone");
        homePage.setClicarButaoPesquisa();
        Assert.assertEquals("Smartphone", homePage.getTextResutadoPesquisa());
        homePage.setClicarCashback();
        Assert.assertEquals("Primeiro, algumas informações importantes!", homePage.getValidarCashback());
        homePage.setClickDicasBusca();
        homePage.setCuponsDesconto();}
    @Test
    public void pageDicasDoBusca(){
        homePage.setEscreverNoCampoBuscape("Samsung Galaxy A10");
        homePage.setLimpar();
        homePage.setEscreverNoCampoBuscape("Samsung Galaxy A11");
        homePage.setLimpar();
        homePage.setEscreverNoCampoBuscape("Samsung Galaxy A22");
        homePage.setLimpar();
    }




    }



