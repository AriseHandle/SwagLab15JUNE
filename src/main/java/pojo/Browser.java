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
            //System.setProperty("webdriver.chrome.driver","E:\\automation-selenium\\chrome-headless-shell-win64\\chrome-headless-shell.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equals("edge"))
        {
           // System.setProperty("webdriver.edge.driver","E:\\edge\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }
}

