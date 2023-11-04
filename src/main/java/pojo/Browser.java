package pojo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
    public static WebDriver openBrowser(String url, String browser){
   WebDriverManager.chromedriver().setup();
        WebDriver driver = null;
        if(browser.equals("chrome"))
        {
            
            driver = new ChromeDriver();
        }
        else if(browser.equals("edge"))
        {
           
            driver = new EdgeDriver();
        }
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }
}

