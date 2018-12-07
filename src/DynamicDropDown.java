import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DynamicDropDown {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.redbus.in/");

        driver.findElement(By.cssSelector("#src")).sendKeys("ver");


        //System.out.println(driver.findElement(By.cssSelector("#src")).getText());

        String script = "return document.getElementById(\"src\").value";

        JavascriptExecutor js = (JavascriptExecutor)driver;

        String srcText = (String) js.executeScript(script);

        System.out.println(srcText);


        while (!srcText.equalsIgnoreCase("Vermanagar")){

            driver.findElement(By.cssSelector("#src")).sendKeys(Keys.DOWN);
            srcText = (String) js.executeScript(script);
            System.out.println(srcText);


        }

    }
}
