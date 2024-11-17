import amazonpageobjects.homepage_pom;
import generics.genericmethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class tc_home{
  public homepage_pom h;
  public genericmethods g;
  public WebDriver driver;


    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver using genericmethods
        g = new genericmethods(driver);
        driver = g.initializeDriver();  // This will initialize and assign the driver

        // Initialize homepage_pom with the driver
        h = new homepage_pom(driver);
    }
    @Test(priority = 1)
    public void openbrowser()
    {
       h. browser();
    }
@Test(priority = 2)
    public void openurl() throws InterruptedException {

        h.url();
        Thread.sleep(300);
    }

    @Test(priority = 3)
    public void clickimg() throws InterruptedException {
        h.img();
    }

    @Test(enabled = false)
    public void clickcheckbox()
    {

        jeans_detailpom j=new jeans_detailpom(driver);
        j.clickcheckbox();
    }
}




