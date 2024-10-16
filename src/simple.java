//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

@Test
public class simple {
	
	
	@Test (priority=2)
	public void signUp() {
		System.out.println("Sign In");
	}
	
	
	
	@Test (priority=1)
	public void signOff() {
		System.out.println("Sign Off");
	}
	
	

	
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
//		  driver.get("https://letcode.in/");
//		  driver.findElement(By.linkText("Log in")).click();

		

	

}
