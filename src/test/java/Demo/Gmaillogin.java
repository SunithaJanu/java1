package Demo;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Gmaillogin {
    public static void main(String[] args)throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunita\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ksrtc.in/oprs-web/");
        driver.findElement(By.xpath("//a[@href='/oprs-web/login/show.do']")).click();
        driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
       /* XSSFWorkbook ws = new XSSFWorkbook("C:\\Users\\Sunita\\Desktop\\readdata.xlsx");
        XSSFSheet pg = ws.getSheet"At(0);

        int i = pg.getPhysicalNumberOfRows();

        for (int user = 1; user < i - 0; user++)
        {
            String Username = pg.getRow(user).getCell(0).getStringCellValue();
            String Password = pg.getRow(user).getCell(1).getStringCellValue();*/
            driver.findElement(By.xpath("//*[@id=\"corover-cb-widget\"]']")).sendKeys("sunithayadav88@gmail.com");
            driver.findElement(By.xpath("//label[@for='password']")).sendKeys("Janu@3132008");
            driver.findElement(By.id("submitBtn")).click();
            driver.close();



    }
}