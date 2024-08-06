import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;

public class Example {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/OneDrive/Desktop/restassurred/chromedriver-win64/chromedriver.exe");
       /*
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int newWidth = (int) (screenWidth * 0.8);
        int newHeight = (int) (screenHeight * 0.8);
*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
     //   options.addArguments("window-size=" + newWidth + "," + newHeight);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = '" + 0.5 + "'");




    }

}
