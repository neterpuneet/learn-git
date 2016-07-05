package nagra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class neter {
	public static WebDriver driver = new FirefoxDriver();
@Test
public void testjenkins()
{
	
driver.get("https://www.facebook.com");
System.out.println(driver.getTitle());
//driver.findElement(By.xpath("neternagra")).click();
	
		
		}
		
}
}		
	
	


