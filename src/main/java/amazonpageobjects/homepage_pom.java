package amazonpageobjects;

import generics.genericmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homepage_pom extends genericmethods {
    public WebDriver driver;
    private genericmethods g;

    public By giftcard=By.xpath("//a[text()=\"Today's Deals\"]");
public By jeansimg=By.xpath("//img[@alt='Cleaning Tools' and contains(@class,'_fluid')]");



    //constructor for diver initialization
    public homepage_pom(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements
    }

    public void browser(){
        driver=initializeDriver();
    }

    public void url()
    {
        driver.get("https://www.amazon.com/");
    }

    public void giftcard()
    {
        clicks(giftcard,10);
    }
    public void img() {


        clicks(jeansimg,10);
    }


}


