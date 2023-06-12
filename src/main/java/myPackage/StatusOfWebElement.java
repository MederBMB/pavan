package myPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class StatusOfWebElement {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        //We can use this 2 methods for any kinds of webelements which we see at the page
        //isDisplayed()   isEnabled() -------->return boolean
        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Displayed status:"+searchStore.isDisplayed()); //true
        System.out.println("Enabled status:"+searchStore.isEnabled()); //true

        //isSelected() ----------> use for radio button, checkbox,dropdown---->return boolean
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(male.isSelected()); //false
        System.out.println(female.isSelected()); //false

        male.click(); //selects male radio button
        System.out.println(male.isSelected()); //true
        System.out.println(female.isSelected()); //false

        female.click(); //selects female radio button
        System.out.println(male.isSelected()); //false
        System.out.println(female.isSelected()); //true



    }
}
