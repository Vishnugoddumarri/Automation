package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testSetup.BaseSetup;


import java.util.List;

public class CartPage extends BaseSetup {

    public CartPage(WebDriver driver) {
        this.driver=driver;
    }

    public void clickOnCartButton(String checkcartButton) {
        By cartIcon = new By.ByCssSelector(checkcartButton);
        WebElement cartElement = driver.findElement(cartIcon);
        cartElement.click();
    }
    public void productDetails(){
        List<WebElement> cartItemsList;
        cartItemsList = driver.findElements(By.cssSelector("div.cart_item"));
        int index = 1;
        double totalPrice = 0.0;
        for(WebElement Details:cartItemsList) {
            WebElement quantityElement = Details.findElement(By.className("cart_quantity"));
            WebElement descriptionElement = Details.findElement(By.className("inventory_item_name"));
            WebElement itemPriceElement = Details.findElement(By.className("inventory_item_price"));
            String itemPrice = itemPriceElement.getText();
            totalPrice = totalPrice + Double.parseDouble(itemPrice);
            System.out.println("PRODUCT--" + index);
            System.out.println("Quantity::"+quantityElement.getText());
            System.out.println("Description::" +descriptionElement.getText());
            System.out.println("Price:"+itemPrice);
            System.out.println("Total:"+totalPrice);

        }
    }
    public void clickOnButtonRemove() {
        By clickOnButtonRemove = By.xpath("//button[text()='REMOVE']");
        WebElement removeElement = driver.findElement(clickOnButtonRemove);
        removeElement.click();
    }
    public void clickOnContinueShoppingButton(){
        By clickContinueShoppingButton=By.xpath("//a[text()='Continue Shopping']");
        WebElement continueShoppingElement=driver.findElement(clickContinueShoppingButton);
        continueShoppingElement.click();
    }
}

