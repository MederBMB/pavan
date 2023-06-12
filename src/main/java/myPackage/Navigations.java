package myPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        //driver.get("https://www.amazon.com/");

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back(); //snapdeal page
        driver.navigate().forward(); //amazon page
        driver.navigate().refresh(); //refresh or reload the page

    }
}
