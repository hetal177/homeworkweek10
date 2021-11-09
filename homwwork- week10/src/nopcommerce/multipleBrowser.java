package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleBrowser {
    static String browser="edge";
    static String baseUrl="https://demo.nopcommerce.com/";
    static WebDriver driver;
    public static void selectBrowser(String browser)  {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver= new ChromeDriver();
            driver.get(baseUrl);
        }else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver= new FirefoxDriver();
            driver.get(baseUrl);
        }else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver= new EdgeDriver();
            driver.get(baseUrl);
        }else{
            System.out.println("Wrong Browser Name");

        }
    }
    public static void main(String[] args) {
      selectBrowser(browser);
       // multipleBrowser obj =new multipleBrowser();
        //obj.selectBrowser(browser);
    }
}
