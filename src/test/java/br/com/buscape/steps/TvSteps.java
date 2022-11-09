package br.com.buscape.steps;

import br.com.buscape.pages.TvPage;
import org.junit.Test;

public class TvSteps extends BaseSteps{
    TvPage tvPage = new TvPage();
    @Test
    public void listaCategoria(){
        tvPage.setCategoria();
        tvPage.setSubcategoria();
        tvPage.setLinkProduto();
    }
}
