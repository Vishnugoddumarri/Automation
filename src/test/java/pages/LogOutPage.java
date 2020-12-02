package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testSetup.BaseSetup;


public class LogOutPage extends BaseSetup {
    public LogOutPage(WebDriver driver) {
        this.driver=driver;
    }

    public void ClickOnLogOutButton() {
        By clickMenu = By.xpath("//button[text()='Open Menu']");
        WebElement menuElement = driver.findElement(clickMenu);
        menuElement.click();
        By buttonLogout = By.id("logout_sidebar_link");
        WebElement logoutElement = driver.findElement(buttonLogout);
        logoutElement.click();
    }
}
