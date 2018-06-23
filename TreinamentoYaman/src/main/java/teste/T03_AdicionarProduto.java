package teste;

import org.junit.Before;
import org.junit.Test;

import applicationWeb.Application;
import pageObjects.PagePesquisa;


public class T03_AdicionarProduto {
	
	@Before
	public void preConditions() throws Exception {
		
	}
	
	@Test
	public void main() throws Exception {
		
		Application app = new Application();
		app.oppenApp();
		try{			
			
		PagePesquisa realizaPesquisa = new PagePesquisa();
		
		String produto = "Relogio Indicador Combustivel Monza 85/93 Sl - Siemens 01992";
		
		realizaPesquisa.preencherCampoPesquisar(produto);
	    realizaPesquisa.clicarBotaoPesquisar();
		}
		catch (Exception e)	{
			System.out.println(e.getMessage());
		}
		
		finally{
			
			app.closeApp();
		}
		
		
	}

}
