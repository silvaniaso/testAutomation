package pageObjects;

import org.openqa.selenium.remote.RemoteWebDriver;

import resource.webPage;

public class PagePesquisa extends webPage {
	RemoteWebDriver pesquisa = browser;

	public PagePesquisa() throws Exception {
		Thread.sleep(2000);
		if (pesquisa.findElementByClassName("nav-search-input").isDisplayed())
			System.out.println("Página carregada");
	}

	public void preencherCampoPesquisar(String produto) throws Exception {
		pesquisa.findElementByClassName("nav-search-input").sendKeys(produto);
	}

	public void clicarBotaoPesquisar() throws Exception {
		pesquisa.findElementByClassName("nav-search-btn").click();
	}
}
