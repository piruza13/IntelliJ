import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginLucky {

    public void clickEl(WebElement element) {
        element.click();
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://luckycarrottest.azurewebsites.net/Billing");

        WebElement element = driver.findElement(By.xpath("//input[@name='Email']"));
        element.sendKeys("narek1@7smarts.com", Keys.TAB, "123456", Keys.ENTER);
        WebElement element2 = driver.findElement(By.id("//*[@id=\"givePointsmodalbtn\"]"));
        LoginLucky loginLucky = new LoginLucky();
        loginLucky.clickEl(element2);

        Actions actions = new Actions(driver);
        actions.moveToElement(element2).click();

    }
}