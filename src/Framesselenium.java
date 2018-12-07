import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesselenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        WebElement ele = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(ele);

        Actions at = new Actions(driver);


        at.dragAndDrop(driver.findElement(By.id("draggable")) , driver.findElement(By.id("droppable"))).build().perform();
    }
}