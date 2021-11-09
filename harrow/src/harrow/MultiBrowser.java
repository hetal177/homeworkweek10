package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser="Edge";
    static String baseUrl="https://www.harrow.org.uk";
    //static WebDriver driver;

    public static void main(String[] args) {
        selectBrowser();

    }
    public static void selectBrowser(){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);
        }else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            WebDriver driver= new EdgeDriver();
            driver.get(baseUrl);
        }else {
            System.out.println("Wrong Browser name");

        }



    }
}
