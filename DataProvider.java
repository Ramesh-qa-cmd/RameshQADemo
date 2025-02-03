package demo;


	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DataProvider {
	WebDriver driver;
		
			@Test
			public void get() {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
			    driver.findElement(By.name("q")).sendKeys("mvnrepository",Keys.ENTER);
			    System.out.println("MVN");
			    driver.quit();
			    
		}

	}


