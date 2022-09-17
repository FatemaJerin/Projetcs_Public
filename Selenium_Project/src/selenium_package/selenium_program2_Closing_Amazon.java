package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_program2_Closing_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		
	        ChromeDriver driver = new ChromeDriver();
		
	        driver.get("http://www.amazon.com/");
	        driver.close();

	}

}
