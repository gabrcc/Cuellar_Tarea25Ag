import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class EnabledCheckoutButtonWhenEmptyCart extends Base{
    @Test
    public void CheckoutButton(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnCart();
        CartPage cartpage = new CartPage(DriverManager.getDriver().driver);
        Assert.assertTrue(cartpage.CheckoutDisplayed());
        System.out.println("CheckOut butt should not be enabled/displayed if the cart is empty\n:( :( :( :( :( :( :( :( :( :( :( :( :( :(");
    }
}
