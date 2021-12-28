package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunita\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=javascript&oq=java&aqs=chrome.1.69i57j0i433i512l2j69i60l2j69i61j69i60l2.4253j0j7&sourceid=chrome&ie=UTF-8");
        JavascriptExecutor js = (JavascriptExecutor) driver;
//Thread sleep(2000);
        js.executeScript("scroll(0,1000)");
        // ((JavascriptExecutor) driver).executeScript("scroll(400,0)");
    }}
