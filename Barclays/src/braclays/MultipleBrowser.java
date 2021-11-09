package braclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {
    static String browser="Chrome";
    static String baseUrl="https://barclays.co.uk";
    static WebDriver driver;
    public void chooseBrowser(String browser) {
        if (browser.equalsIgnoreCase("chromE")) {// equalsIgnoreCase will accept any case letter
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
        } else if (browser.equalsIgnoreCase("edgE")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);
        } else {
            System.out.println("Wrong Browser Name");
        }
    }

    public static void main(String[] args) {
        MultipleBrowser obj=new MultipleBrowser();
        obj.chooseBrowser(browser);
    }
}
