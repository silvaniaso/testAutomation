package funcionalidade;

import pageObjects.PagePesquisa;

public class RealizaPesquisa {

	public void Pesquisar() throws Exception {
		PagePesquisa pagePesquisa = new PagePesquisa();

		String produto = "Relogio Indicador Combustivel Monza 85/93 Sl - Siemens 01992";
		pagePesquisa.preencherCampoPesquisar(produto);
		pagePesquisa.clicarBotaoPesquisar();

	}
	

}
