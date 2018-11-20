import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\workspace\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://echoecho.com/htmlforms10.htm");
        System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());


        //driver.close();

        System.out.println("Hello World!");
    }

    public void test(){
      /*  driver.get("https://www.spicejet.com/");
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[value='HBX']")).click();
        driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();

        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());*/



    }
}
