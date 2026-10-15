package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class BaseClass {
    public static WebDriver driver;

    public static void setup() {
        ConfigReader.loadConfig();
        String browser = ConfigReader.get("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));
    }

    public static void tearDown() {
        driver.quit();
    }
}


