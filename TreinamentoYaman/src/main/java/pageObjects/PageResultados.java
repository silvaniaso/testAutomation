package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import resource.webPage;

public class PageResultados extends webPage {

	static RemoteWebDriver resultados = browser;

	public void buscaResultados() throws Exception {

		for (int i = 1; i <= 5; i++) {
			String titulo = resultados
					.findElementByXPath("//li[" + i + "]//a/div/h2/span[contains(@class='main-title','')]").getText();
			System.out.println("Produto " + i + ": " + titulo);

			String preco = resultados.findElementByXPath("//li[" + i + "]//a/div/div[contains(@class='item_price','')]")
					.getText();
			System.out.println("Preço: " + preco + "\n");
		}
	}

	public void validaPaginacao() throws Exception {

		WebElement paginacao = resultados.findElementByXPath("//*[@id='results-section']/div[2]/ul/li[3]");

		if (paginacao != null) {
			paginacao.click();
			Thread.sleep(2000);
			if (resultados.findElementByClassName("nav-search-input").isDisplayed())
				System.out.println("Pagina 2 carregada!");
		} else {
			System.out.println("Paginação não está ativada");
		}
	}

	public void recuperaPenultimoAnuncio() throws Exception {
		List<WebElement> geral = resultados
				.findElements(By.xpath("//section/ol[contains(@id='searchResults','')]//a//h2"));
		int totalDeAnuncios = geral.size();

		WebElement penultimoAnuncio = resultados
				.findElementByXPath("//*[@id='searchResults']/li[" + (totalDeAnuncios - 1) + "]");
		takeScreenshot(penultimoAnuncio);

	}

	/* Método para capturar screenshot */
	public static void takeScreenshot(WebElement penultimoAnuncio) {
		File scrFile = ((TakesScreenshot) resultados).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\desafio\\evidencias\\penultimoanuncio.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PageResultados() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
}
