import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnSelenium {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        // Actions Class to do Different Actions on WebElement

        Actions a = new Actions(driver);

        // ************Mouse Over to an Element *********************
        WebElement moveToSignIn = driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']"));

        a.moveToElement(moveToSignIn).contextClick().build().perform();




        //Composite

        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("redmi note pro ").keyUp(Keys.SHIFT).sendKeys("6").doubleClick().build().perform();
       // mouseOver(driver);

    }

    /*public void mouseOver(WebDriver driver){



        a.



    }*/


}
