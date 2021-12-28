package Demo;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Readdata {
    public static void main(String[] args)throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunita\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //Reading xlsx file
        XSSFWorkbook ws = new XSSFWorkbook("C:\\Users\\Sunita\\Desktop\\readdata.xlsx");
        XSSFSheet pg=ws.getSheetAt(0);

        int i=pg.getPhysicalNumberOfRows();

        for(int user=1;user<i-0;user++){
            String Uname = pg.getRow(user).getCell(0).getStringCellValue();
           String Password=pg.getRow(user).getCell(1).getStringCellValue();
            driver.findElement(By.id("email")).sendKeys(Uname);
            driver.findElement(By.id("pass")).sendKeys(Password);
            driver.findElement(By.name("login")).click();

            driver.close();

        }

    }
}
