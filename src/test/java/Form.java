import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Form {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/OneDrive/Desktop/restassurred/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        String forms="/html/body/div[2]/div/div/div[2]/div/div[2]";
        driver.findElement(By.xpath(forms)).click();
//        js.executeScript("document.body.style.zoom = '" + 0.7 + "'");
        String pform="/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li";
        driver.findElement(By.xpath(pform)).click();
        String chooseFile="/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[8]/div[2]/div/input";
        js.executeScript("window.scrollBy(0,900)");
        driver.findElement(By.xpath(chooseFile)).click();
    }
}
