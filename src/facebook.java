import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        WebElement firstName = driver.findElement(By.id("u_0_j"));
        firstName.sendKeys("greens");
        
        WebElement surName = driver.findElement(By.id("u_0_l"));
        surName.sendKeys("tech");
        
        WebElement mobileNumber = driver.findElement(By.id("u_0_o"));
        mobileNumber.sendKeys("5654545646");
        
        WebElement newPassword = driver.findElement(By.id("u_0_v"));
        newPassword.sendKeys("greens");
        
        WebElement sex = driver.findElement(By.id("u_0_a"));
        sex.click();
        
        WebElement btnSignup = driver.findElement(By.id("u_0_11"));
        btnSignup.click();
        
        
}
}

	