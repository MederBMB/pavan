package uiTest;

import dataProviders.ConfigReader;
import driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import pages.RegisterPage;

public abstract class BaseTest {

    public RegisterPage registerPage;
    public WebDriver driver;

    @BeforeClass
    public void setUpUiTest(){
        registerPage = new RegisterPage();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));

    }
}
