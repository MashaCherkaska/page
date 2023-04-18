package com.amazon.drivermanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    private WebDriverFactory(){}

    public static WebDriver getDriver(String driver){

        switch(driver){
            case "chrome":
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                return new ChromeDriver();
                //break;  net ego potomu chto est; slovo 'return' eto avto prerivanie i vihod iz metoda
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
                return new EdgeDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                return new ChromeDriver();


        }
    }
}
