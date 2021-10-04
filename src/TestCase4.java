import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class TestCase4 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        HttpURLConnection c = (HttpURLConnection) new URL("https://reqres.in/api/users/23") .openConnection();

        c.setRequestMethod("HEAD");
        c.connect();
        int res;
        res = c.getResponseCode();
        Assert.assertEquals(res,"404");

    }
}
