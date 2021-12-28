package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;

public class Login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunita\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement Username = driver.findElement(By.id("email"));
        Username.sendKeys("Sunithayadav88@gmail.com");
        WebElement Password = driver.findElement(By.id("pass"));
        Password.sendKeys("suni@88990");
        WebElement Login = driver.findElement(By.name("login"));
        Login.click();

    }
}
