package myPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        //We have 2 ways to launch browser

        //FIRST WAY    ****With download drivers****
        //Launch Chrome Browser
        //System.setProperty(key, value);
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();         //ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");*/


        //Launch Firefox Browser    EST' OSHIBKA
        /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Админ\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver");
        WebDriver driver = new FirefoxDriver();  //FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/");*/

        //Launch Edge Browser       EST' OSHIBKA
        /*System.setProperty("webdriver.edge.driver", "C:\Users\Админ\Downloads\edgedriver_win64\msedgedriver");
        WebDriver driver = new EdgeDriver();  //EdgeDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/");*/

        //SECOND WAY  ****Using WebDriverManager****
        //Launch Chrome Browser
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");*/

        //Launch Firefox Browser    EST' OSHIBKA
        /*WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/");*/

        //Launch Edge Browser
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/");
        System.out.println("Title of the web page is " + driver.getTitle());
        System.out.println("Current URL of the web page is " + driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


    }
}
