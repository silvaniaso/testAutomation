

package pageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import resource.webPage;



public class FaleConosco extends webPage {
    

    static RemoteWebDriver resultados = browser;
    
    WebElement nome = resultados.findElementById("nome");
    WebElement empresa = resultados.findElementById("Empresa");
    WebElement Dominio = resultados.findElementById("Empresa0");
    List <WebElement> assunto = resultados.findElementsByName("duvidapara");
    WebElement DDD = resultados.findElementById("ddd");
    WebElement Email = resultados.findElementById("email");
    WebElement Mensagem = resultados.findElementByName("mensagem");
    WebElement Submit = resultados.findElementById("Enviar");
    
    public void inserirValor(WebElement valor,String dados) throws Exception {
    	
    	valor.sendKeys(dados);
    	
    }
    
    public FaleConosco() throws Exception {
        super();
        // TODO Auto-generated constructor stub
    }
}