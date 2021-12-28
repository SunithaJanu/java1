package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunita\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application
        driver.get("https://www.redbus.in/");

        //Find element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.id("search_btn"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("arguments[0].click();",Element);
    }
}