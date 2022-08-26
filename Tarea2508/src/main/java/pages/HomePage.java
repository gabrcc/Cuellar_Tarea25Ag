package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "app_logo")
    WebElement appLogo;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement sauceLabsBackPackAddToCartButton;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement BikeLightAddToCartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement sauceLabsBackPackRemoveToCartButton;
    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']")
    WebElement iconLinkedin;
    @FindBy(id = "react-burger-menu-btn")
    WebElement MenuLinesIcon;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement BikeLight;
    //nav[1]/ul[@id='sideNavigation']
    @FindBy(xpath = "//nav[1]/ul[@id='sideNavigation']//a[contains(text(),'LOGOUT')]")
    //@FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement LogoutOption;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean appLogoIsDisplayed() {
        boolean appLogoIsDisplayed = appLogo.isDisplayed();
        return appLogoIsDisplayed;
    }
    public boolean iconLinkedinIsDisplayed() {
        boolean iconLinkedinIsDisplayed = iconLinkedin.isDisplayed();
        return iconLinkedinIsDisplayed;
    }

    public void clickOnLinkedInIcon(){cartIcon.click();
        iconLinkedin.click();
    }
    public String getCartIconText(){
        String cartText = cartIcon.getText();
        return cartText;
    }
    public void clickOnCart(){cartIcon.click();
    }
    public void clickBikeLightItem(){BikeLight.click();}

    public void clickOnAddSauceLabsBackPackToCartButton(){
        sauceLabsBackPackAddToCartButton.click();
    }

    public void clickOnRemoveSauceLabsBackPackToCartButton(){
        sauceLabsBackPackRemoveToCartButton.click();
    }
    public void clickOnAddBikeLightToCartButton(){
        BikeLightAddToCartButton.click();
    }
    public void clickMenuLinesIcon(){MenuLinesIcon.click();}
    public void clickLogoutOption(){LogoutOption.submit();
    }
}

