package br.com.buscape.pages;

import org.openqa.selenium.By;

public class TvPage extends BasePage{
    private static final By categoria = new
            By.ByCssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_second-line_" +
            "_qIShd > div > div > div.DoubleHeader_second-column__OFGbE.col > nav > ul > li:nth-child(1) > div");
    private static final By subcategoria = new
            By.ByCssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_second-line_" +
            "_qIShd > div > div > div.DoubleHeader_second-column__OFGbE.col > nav > ul > li:nth-child(1) > div > nav " +
            "> ul > li:nth-child(2) > a");
    private static final By linkProduto = new
            By.ByCssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_second-line_" +
            "_qIShd > div > div > div.DoubleHeader_second-column__OFGbE.col > nav > ul > li:nth-child(1) > div > nav " +
            "> ul > li:nth-child(2) > div > div > a:nth-child(2)");
    public void setCategoria(){ click(categoria);}
    public void setSubcategoria(){ click(subcategoria);}
    public void setLinkProduto(){ click(linkProduto);}
}
