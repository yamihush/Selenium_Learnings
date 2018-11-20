
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Alert {


    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();

        driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();

        File  src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Muthukumar\\Pictures\\Testing"));

        //driver.close();

        System.out.println("Hello World!");
    }
}
