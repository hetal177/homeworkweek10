package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        String baseUrl="https://www.harrow.org.uk";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String Title=driver.getTitle();
        System.out.println(Title);
        driver.close();

    }
}
