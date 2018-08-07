import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoQA {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demoqa.com/registration/");
        WebElement firstName = driver.findElement(By.id("name_3_firstname"));
        firstName.sendKeys("greens");
        
        WebElement lastName = driver.findElement(By.id("name_3_lastname"));
        lastName.sendKeys("tech");
        
        WebElement maritalstatus = driver.findElement(By.xpath("//input[@value='single']"));
        maritalstatus.click();
        
        WebElement hobby = driver.findElement(By.xpath("//input[@value='dance']"));
        hobby.click();
        
        WebElement hobby2 = driver.findElement(By.xpath("//input[@value='reading']"));
        hobby2.click();
        
        
        WebElement phoneNumber = driver.findElement(By.id("phone_9"));
        phoneNumber.sendKeys("6545468789");
        
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("greens");
        
        WebElement email = driver.findElement(By.id("email_1"));
        email.sendKeys("greens@gmail.com");
        
        WebElement about = driver.findElement(By.id("description"));
        about.sendKeys("Hi all");
        
        WebElement password = driver.findElement(By.id("password_2"));
        password.sendKeys("greens123");
        
        WebElement confirmPassword = driver.findElement(By.id("confirm_password_password_2"));
        confirmPassword.sendKeys("greens123");
        
        WebElement submit = driver.findElement(By.name("pie_submit"));
        submit.click();
	}

}
