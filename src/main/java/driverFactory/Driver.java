package driverFactory;

import dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            if ("edge".equalsIgnoreCase(ConfigReader.getProperty("browser"))) {
                driver = EdgeWebDriver.loadEdgeDriver();
            } else {
                driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }

}
