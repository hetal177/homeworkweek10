package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[]args){
        String baseurl="https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String getTitle=driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
