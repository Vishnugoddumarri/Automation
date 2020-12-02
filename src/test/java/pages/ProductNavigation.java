package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testSetup.BaseSetup;

public class ProductNavigation extends BaseSetup {
    public ProductNavigation(WebDriver driver) {
        this.driver=driver;
    }

    public void navigateProductPage(String navigate){
        By checkNavigate = new By.ByXPath(navigate);
        WebElement checkNavigateElement = driver.findElement(checkNavigate);
        checkNavigateElement.click();
        Assert.assertTrue(driver.getTitle().equals("Swag Labs"));

    }
}
