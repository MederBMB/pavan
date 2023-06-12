package myPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        //findElement() -----> Returns single WebElement
        //Scenario1 -----> returns single Element
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchbox.sendKeys("XYZ");
        //Scenario2 -----> returns first Element
        WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(ele.getText());
        //Scenario3 -----> NoSuchElementException (xpath incorrect, there is no element with this xpath)
        WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='login']"));


        ///findElements() -----> Returns multiple WebElements
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Number of "+links.size());


    }
}
