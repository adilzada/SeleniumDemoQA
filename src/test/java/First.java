import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class First {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:/Users/acer/OneDrive/Desktop/restassurred/chromedriver-win64/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--start-maximized");

            WebDriver driver = new ChromeDriver(options);


//            driver.get("https://www.youtube.com/");
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,500)");
//            String search="/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input";
//            // Butona tıklayın
////            button.click();
//            driver.findElement(By.xpath(search)).sendKeys("masha i medved");
//            String searchButton="/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/button";
//            WebElement button = driver.findElement(By.xpath(searchButton));
//            driver.findElement(By.xpath(searchButton)).click();
//            String choose="/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[2]/div[1]/div/div[2]/ytd-channel-name/div/div/yt-formatted-string/a";
//            driver.findElement(By.xpath(choose)).click();



            driver.get("https://demoqa.com");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
            String winget="/html/body/div[2]/div/div/div[2]/div/div[4]";
            String accordian="/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[1]";
            driver.findElement(By.xpath(winget)).click();
//            driver.findElement(By.id("item-0")).click();
            js.executeScript("window.scrollBy(0,600)");
            driver.findElement(By.xpath(accordian)).click();
            js.executeScript("window.scrollBy(0,600)");
        }


}
