import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;

public class LaunchingChromeBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		  driver.get("https://letcode.in/");
		  
		  driver.manage().window().maximize(); //
		  driver.findElement(By.linkText("Log in")).click(); //
		  driver.findElement(By.name("email")).sendKeys("guna8877@gmail.com"); //
		  driver.findElement(By.name("password")).sendKeys("Gunaaa"); //
		  driver.findElement(By.xpath ("//button[normalize-space()='LOGIN']")).click();
			
		
		
//		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
//		driver.findElement(By.id("name")).sendKeys("Guna");
//		driver.findElement(By.id("email")).sendKeys("guna8877@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Gunaaa");
//		driver.findElement(By.id("agree")).click();
//		driver.findElement(By.xpath("//button[@class='button is-primary']")).submit();
		
		  
		  
		  driver.get("https://letcode.in/edit");
		  
		  driver.findElement(By.id("fullName")).sendKeys("Gunaseelan salamon");
		  
		
		
		  driver.findElement(By.id("join")).sendKeys(" in programming", Keys.TAB);
		  
		
		//WHAT IS INSIDE THE TEXT BOX
		  
		String myValue = driver.findElement(By.id("join")).getAttribute("value");
		System.out.println(myValue);
		
		
		
		
		//clear the text
		
		driver.findElement(By.id("clearMe")).clear();
		
		
		//confirm edit field is disabled
		
		boolean isEnabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEnabled);
		
		//confirm text is read only
		
		String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);
		
		//quit browser
		driver.quit();
		
		
		
		
		
	}

}
