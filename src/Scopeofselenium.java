import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Scopeofselenium {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        //To find the No of LINKS in the Entire WEB SITE

        int countAllTags = driver.findElements(By.tagName("a")).size();

        System.out.println("All Links in the Entire Website : "+ countAllTags );


        // //To find the No of LINKS only  in the FOOTER Section of the WEB SITE

        WebElement footerDriver = driver.findElement(By.id("navFooter"));   // create a SUB Driver

        int countFootTags = footerDriver.findElements(By.tagName("a")).size();

        System.out.println("Footer Links in the Website : "+ countFootTags );

        WebElement innnerFooterEle = footerDriver.findElement(By.cssSelector("div[class='navFooterVerticalRow navAccessibility']"));

        int countInnerFootTags = innnerFooterEle.findElements(By.tagName("a")).size();

        System.out.println("Inner column of Footer with all Tags :"+ countInnerFootTags );


        //OPEN Multiple Links and Grab All the TIttle


        for (int i =0;i<countInnerFootTags;i++) {

            String ctrlEnter = Keys.chord(Keys.CONTROL, Keys.ENTER);
            innnerFooterEle.findElements(By.tagName("a")).get(i).sendKeys(ctrlEnter);

        }

        Set<String> wins = driver.getWindowHandles();

        Iterator<String> it = wins.iterator();

        while(it.hasNext()){

            driver.switchTo().window(it.next());
            System.out.println("Tittle  :  " + driver.getTitle());

        }

    }
}
