package resource;

import org.openqa.selenium.remote.RemoteWebDriver;
import applicationWeb.Application;

public class webPage {
	
	public static RemoteWebDriver browser;
	
	
	public webPage() throws Exception{

		Application application = new Application();
		browser = application.getBrowser();
		
		
	}
}
