import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendCarrot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://luckycarrotapp.com/App");
        WebElement element2 = driver.findElement(By.id("//*[@id=\"givePointsmodalbtn\"]"));
        element2.click();
    }
}
