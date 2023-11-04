package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {
	
	public static void takeScreenShot(WebDriver driver) throws IOException {
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\workspace\\Project1\\SwagLab15JUNE\\ScreenShot");
		FileHandler.copy(source,destination);
		
	}

}
