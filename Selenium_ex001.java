package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ex001 {
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com/#/login");
		driver.manage().window().minimize();
		driver.quit();
	}

}
