package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public void loginPage (String user,String password) {
        By userName = By.id("user-name");
        WebElement typeUserName = driver.findElement(userName);
        typeUserName.sendKeys(user);
        typeUserName.click();

        By passWord = By.id("password");
        WebElement typePassword = driver.findElement(passWord);
        typePassword.sendKeys(password);
        typePassword.click();

        By loginButton = By.id("login-button");
        WebElement clickOnLoginButton = driver.findElement(loginButton);
        clickOnLoginButton.click();
    }

}
