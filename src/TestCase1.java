import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Document;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.crawco.co.uk");
           WebElement m = driver.findElement(By.xpath("//html/body/div[1]/div[1]/footer/div/div[1]/p[2]/a[2]"));
            Thread.sleep(6000);
            m.click();
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.facebook.com/crawfordandco");
            System.out.println("URL matching - part executed");

    }
}
