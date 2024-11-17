import generics.genericmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class jeans_detailpom extends genericmethods {

    public By jeansdetailpage=By.xpath("//a[@href=\"/s?k=Jeans&i=fashion-womens-clothing&rh=n%3A1048188%2Cp_36%3A-5000%2Cp_123%3A200356&dc&_encoding=UTF8&content-id=amzn1.sym.56e14e61-447a-443b-9528-4b285fddeeac&crid=1TZCO6ZC2HZVA&pd_rd_r=453cf4e4-6b88-43e8-ae4e-24254e56504f&pd_rd_w=SfqHN&pd_rd_wg=CRFyt&pf_rd_p=56e14e61-447a-443b-9528-4b285fddeeac&pf_rd_r=GN4VXXXK6KD564R5SJ6J&qid=1731351513&rnid=85457740011&sprefix=jeans%2Caps%2C155&ref=sr_nr_p_123_1&ds=v1%3ApmQZtW3fHgRHDZDwCM%2F73NjMoHM%2F4mpdO9GTpaYxx%2BM\"]");



 public WebDriver driver;
public jeans_detailpom(WebDriver driver)
{
    super(driver);
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
public void printallopt()
{
   List<WebElement> li =driver.findElements(By.xpath("//ul[@data-csa-c-content-id='85457740011']"));
   for (WebElement print:li)
   {
       System.out.println(print.getText());
   }
}
public void clickcheckbox()
{
    clicks(jeansdetailpage,70);
}

}
