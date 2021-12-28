import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunita\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
        WebElement from = driver.findElement(By.id("fromPlaceName"));
        from.sendKeys("Ben");
        from.sendKeys(Keys.DOWN);
        // System.out.println("otp is"+from.getText());//
        String script = "return document.getElementById('fromPlaceName').value";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String txt = (String) js.executeScript(script);
        System.out.println("opt is" + txt);
        while (!"CHIKKALSANDRA BENGALURU".equalsIgnoreCase(txt))
    {
            from.sendKeys(Keys.DOWN);

            txt = (String) js.executeScript(script);
        }
        from.sendKeys(Keys.ENTER);
        //To place
        WebElement to = driver.findElement(By.id("toPlaceName"));
        to.sendKeys("Chi");
        to.sendKeys(Keys.DOWN);
        // System.out.println("otp is"+from.getText());//
        String script1 = "return document.getElementById('toPlaceName').value";
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        String txt2 = (String) js1.executeScript(script1);
        System.out.println("opt is" + txt);
        while (!"CHITTOOR".equalsIgnoreCase(txt2))
        {
            to.sendKeys(Keys.DOWN);

            txt2 = (String) js1.executeScript(script1);
        }
        to.sendKeys(Keys.ENTER);




}
}