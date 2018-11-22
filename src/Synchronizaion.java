import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronizaion {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/hotels/");
        // ************************* IMPLEMENTAION OF BOTH IMPLICIT WAIT AND EXPLICIT WAIT *******************

        driver.findElement(By.xpath("//input[@id='hp-widget__sDest']")).sendKeys("Indian Institute of World Culture, Bangalore, India");
        driver.findElement(By.xpath("//button[@id='searchBtn']")).click();

        // ***********************Implicit Wait   ***********5 seconds************************

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("div.fix_header_mar_top:nth-child(3) div.container:nth-child(11) div.row_listing:nth-child(2) div.row.clearfix:nth-child(1) div.card:nth-child(1) div:nth-child(1) a:nth-child(1) > div.card__content.clearfix")).click();

        // ***********************Explicit Wait   ********************15 seconds ***************

        WebDriverWait d = new WebDriverWait(driver , 15);
        d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.fix_header_mar_top:nth-child(3) div.container:nth-child(11) div.row_listing:nth-child(2) div.row.clearfix:nth-child(1) div.card:nth-child(1) div:nth-child(1) a:nth-child(1) > div.card__content.clearfix")));  // Wait for 15 secs


        //******************************************************************************************
        // ONCE THE EXPLICT WAIT IS FINISHED FOR 15 SEC's THE THERE AFTER ONLY THE DRIVER WAIT FOR ONLY 5 SEC"s NOT FOR 15 SEC's
        // RATHER THAN DRIVER d is NOT USED
        //************************************************************************************************************************

        d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#js-hotelName-0")));  // Wait for 15 secs

        driver.close();


    }


}
