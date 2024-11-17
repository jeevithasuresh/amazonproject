package generics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class genericmethods {
  protected   WebDriver driver;

    public genericmethods(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver initializeDriver() {
        try{
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Driver initialized: " + driver);
            return driver;
        } catch (Exception e) {
             System.out.println("Error initializing WebDriver: " + e.getMessage());// Return null if WebDriver fails to initialize
             return null;
            }



    }


    public void clicks(By element,long time) {

        {

            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
         //   wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("overlay-xpath")));
           WebElement target=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("element")));
           target.click();

        }

    }


    public void sendkeys(WebElement elementforinput,String input)
    {
        elementforinput.sendKeys(input);
    }

    public void dropdownselectbyvalue(WebElement elementfordropdown,String value)
    {
    Select s=new Select(elementfordropdown);
    s.selectByValue(value);
    }

    public void alerts(WebDriver driver)
    {
        try {
            driver.switchTo().alert().accept();
            System.out.println("Alert was present and accepted.");
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present.");
        }
        }
        }

