package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testSetup.BaseSetup;

public class CheckOutPage extends BaseSetup {
    public CheckOutPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickCheckOut(String checkOutButton){
        By checkOutIcon = new By.ByXPath(checkOutButton);
        WebElement checkOutElement = driver.findElement(checkOutIcon);
        checkOutElement.click();
    }
    public void firstName(String name,String checkOutFirstname){
        By firstname = new By.ByXPath(checkOutFirstname);
        WebElement firstnameElement = driver.findElement(firstname);
        firstnameElement.click();
        firstnameElement.sendKeys(name);

    }
    public void lastName(String lastname,String checkOutLastname){
        By last_name = new By.ByXPath(checkOutLastname);
        WebElement last_nameElement = driver.findElement(last_name);
        last_nameElement.click();
        last_nameElement.sendKeys(lastname);

    }
    public void postalCode(String zipCode,String checkOutPostalCode){
        By postal_Code = new By.ByXPath(checkOutPostalCode);
        WebElement postal_CodeElement = driver.findElement(postal_Code);
        postal_CodeElement.click();
        postal_CodeElement.sendKeys(zipCode);

    }
    public void clickCancel(String cancelButton){
        By cancelIcon = new By.ByXPath(cancelButton);
        WebElement cancelElement = driver.findElement(cancelIcon);
        cancelElement.click();

    }



}
