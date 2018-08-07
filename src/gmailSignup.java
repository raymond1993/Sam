import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailSignup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signup");
        
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("greens");
        

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("greens");
        
        

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("greens123");
        
        

        WebElement password = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
        password.sendKeys("greens");

}
}
