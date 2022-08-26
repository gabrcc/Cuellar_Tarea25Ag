package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    //@FindBy(className = "btn btn_action btn_medium checkout_button" )
    @FindBy(id = "checkout")
    WebElement CheckoutButton;
    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement BikeLight;
    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean CheckoutDisplayed(){
        boolean CheckoutDisplayed = CheckoutButton.isDisplayed();
        return CheckoutDisplayed;
    }
    public void ClickCheckoutButton(){CheckoutButton.click();}
    public boolean BikeLightDisplayedOnCart(){
        boolean BikeLightDisplayedOnCart = BikeLight.isEnabled();
        return BikeLightDisplayedOnCart;
    }
}
