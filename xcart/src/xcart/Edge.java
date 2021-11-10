package xcart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge{
    public static void main(String[]args){
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.x-cart.com");
        driver.manage().window().maximize();
        driver.close();
    }


}

        




