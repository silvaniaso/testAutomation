package funcionalidade;

import pageObjects.PageResultados;

public class ProcuraResultados {

	public void validaResultados() throws Exception {
		PageResultados pageResultado = new PageResultados();
		pageResultado.buscaResultados();
	}

	public void paginacao() throws Exception {
		PageResultados pageResultado = new PageResultados();
		pageResultado.validaPaginacao();
		pageResultado.recuperaPenultimoAnuncio();
	}
}
