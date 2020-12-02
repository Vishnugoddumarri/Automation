package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testSetup.BaseSetup;


public class HomePage extends BaseSetup {

    public HomePage(WebDriver driver) {
        this.driver= driver;

    }

    public void clickOnProduct(String productLocator){
        By product=By.xpath(productLocator);
        WebElement productElement=driver.findElement(product);
        productElement.click();
        By clickOnButton=By.xpath("//button[text()='ADD TO CART']");
        WebElement buttonElement=driver.findElement(clickOnButton);
        buttonElement.click();
        By clickOnBackButton= By.xpath("//button[text()='<- Back']");
        WebElement backElement=driver.findElement(clickOnBackButton);
        backElement.click();
    }
    public void clickMultipleProducts(String addCart){
        By clickOnButton=By.xpath(addCart);
        WebElement buttonElement=driver.findElement(clickOnButton);
        buttonElement.click();
    }
}
