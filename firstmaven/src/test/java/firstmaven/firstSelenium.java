package firstmaven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; 
public class firstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.get("https:/www.facebook.com");
	}

}
