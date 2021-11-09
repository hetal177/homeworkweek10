import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    String browser="edge";
    String baseUrl="https://wcht.org.uk";
    WebDriver driver;
    public static void main(String[] args) {
        MultiBrowser obj=new MultiBrowser();
        obj.selectBrowser();
    }
    public  void selectBrowser(){
        if(browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
        }else if(browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.drivers", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver=new EdgeDriver();
            driver.get(baseUrl);
        } else {
        System.out.println("Wronge Browser Name");
    }
}

    }

