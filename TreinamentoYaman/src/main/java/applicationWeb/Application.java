package applicationWeb;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Application {

	private static String appBrowser;
	private static String appURL;
	private static RemoteWebDriver driver;

	public Application() throws IOException {

		Application.appBrowser = "CHROME";
		Application.appURL = "MERCADO LIVRE";
	}

	public void oppenApp() throws Exception {

		closeApp();
		setBrowser();
		setWebUrl();

		driver.navigate().to(Application.appURL);
		driver.manage().window().maximize();

	}

	public void setBrowser() throws Exception {

//		switch (Application.appBrowser) {
//		case "CHROME":
//			Application.driver = new ChromeDriver();
//			break;
//		case "IEXPLORE":
//			Application.driver = new InternetExplorerDriver();
//			break;
//		case "FIREFOX":
//			Application.driver = new FirefoxDriver();
//			break;
//		default:
//			System.out.println("Browser não é válido!");
//		}
//
		
		Application.driver = new ChromeDriver();
}
		
		
		
	public void setWebUrl() throws Exception {

//		switch (Application.appURL) {
//		case "MERCADO LIVRE":
//			Application.appURL = "https://www.mercadolivre.com.br/";
//			break;
//
//		default:
//			System.out.println("Sistema não é válido!");
//		}
		Application.appURL = "https://www.mercadolivre.com.br/";
	}

	public void closeApp() throws IOException {
		Runtime.getRuntime().exec("TASKKILL /F /IM chrome.exe");

	}

	public RemoteWebDriver getBrowser() throws Exception {
		return Application.driver;
	}

	public String getURL() throws Exception {
		return Application.appURL;
	}
}
