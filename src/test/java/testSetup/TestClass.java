package testSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

    public class TestClass extends BaseSetup{
        //LoginPage inputs
        String user = "standard_user";
        String password=  "secret_sauce";
        //HomePage inputs
        String productLocator="//div[text()='Sauce Labs Backpack']";
        String addCart="//button[@class='btn_primary btn_inventory']";
        int count=3;
        //CartPage inputs
        String checkcartButton="svg[data-icon='shopping-cart']";
        //Verify Product Navigation
        String navigate="//div[@class='inventory_item_name']";
        //CheckOutPage inputs
        String checkOutButton="//a[@class='btn_action checkout_button']";
        String checkOutFirstname="//input[@id='first-name']";
        String name="Person";
        String lastname="person";
        String checkOutLastname="//input[@id='last-name']";
        String zipCode="515001";
        String checkOutPostalCode="//input[@id='postal-code']";
        String cancelButton="//a[@class='cart_cancel_link btn_secondary']";
        String browser="Chrome";


        @Test
        public void testSwagLabs(){
            //LoginPage actions
            LoginPage login = new LoginPage(driver);
            login.loginPage(user, password);

            //Test Title
            Assert.assertTrue(driver.getTitle().equals("Swag Labs"));

            //HomePage actions
            HomePage home=new HomePage(driver);
            if(count>0 && count<6){
                for(int i=1;i<=count;i++)
                {
                    home.clickMultipleProducts(addCart);
                }
            }
            else {
                home.clickOnProduct(productLocator);
            }

            //CartPage actions
            CartPage cart=new CartPage(driver);
            cart.clickOnCartButton(checkcartButton);

            //Verify CartPage Title
            Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
            cart.productDetails();

            //CheckOutPage actions
            CheckOutPage checkOut=new CheckOutPage(driver);
            checkOut.clickCheckOut(checkOutButton);
            checkOut.firstName(name,checkOutFirstname);
            checkOut.lastName(lastname,checkOutLastname);
            checkOut.postalCode(zipCode,checkOutPostalCode);
            checkOut.clickCancel(cancelButton);
              ProductNavigation checkNavigate=new ProductNavigation(driver);

            //Remove added products
            if(count>0 && count<6) {
                for (int i = 1; i <= count; i++) {
                    checkNavigate.navigateProductPage(navigate);
                    cart.clickOnCartButton(checkcartButton);
                    cart.clickOnButtonRemove();
                }
            }
            else {
                cart.clickOnButtonRemove();
            }

            cart.clickOnContinueShoppingButton();




            //LogoutPage actions
            LogOutPage log=new LogOutPage(driver);
            log.ClickOnLogOutButton();


        }

        @BeforeMethod
        public void initialisation(){
            launchBrowserUrl("Chrome");

        }
        @AfterMethod
        public void teardown(){
            driver.close();
        }

    }



