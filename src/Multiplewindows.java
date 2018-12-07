import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Multiplewindows {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup");

        driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();

        System.out.println(driver.getTitle() + "<<<----------------------parent");

        Set<String> ids = driver.getWindowHandles();

        Iterator<String> it = ids.iterator();

        String parentid = it.next();

        System.out.println(parentid);

        String childid = it.next();

        //String childid2 = it.next();

        System.out.println(childid + "<<<<----------------");
        driver.switchTo().window(childid);

        driver.switchTo().window(parentid);

        System.out.println(driver.getTitle() + "<<<-------------------------child");
    }
}
