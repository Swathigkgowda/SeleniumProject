import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://reqres.in/api/users/6");

        WebElement element = driver.findElement(new By.ByXPath("//pre"));
        JSONObject jsonObject = new JSONObject((element.getText()));
        JSONObject getSth = jsonObject.getJSONObject("data");
        Object Fname = getSth.get("first_name");


        Object Lname = getSth.get("last_name");


        Assert.assertEquals(Fname,"Sergio");
        Assert.assertEquals(Lname,"Ramos"); // Exected result : 'Sergio' but API returning Tracey so this assert will fail
    }
}
