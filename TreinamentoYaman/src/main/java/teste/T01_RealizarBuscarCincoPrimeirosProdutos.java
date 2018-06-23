package teste;

import org.junit.Before;
import org.junit.Test;

import applicationWeb.Application;
import funcionalidade.ProcuraResultados;
import funcionalidade.RealizaPesquisa;


public class T01_RealizarBuscarCincoPrimeirosProdutos {
	
	@Before
	public void preConditions() throws Exception {
		
	}
	
	@Test
	public void main() throws Exception {
		
		Application app = new Application();
		app.oppenApp();
		try{			
			RealizaPesquisa realizaPesquisa = new RealizaPesquisa();
			ProcuraResultados resultados = new ProcuraResultados();
			realizaPesquisa.Pesquisar();
			resultados.validaResultados();
			
	
		}
		catch (Exception e)	{
			System.out.println(e.getMessage());
		}
		
		finally{
			
			app.closeApp();
		}
		
		
	}

}
