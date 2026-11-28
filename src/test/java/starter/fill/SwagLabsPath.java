package starter.fill;

import com.vladsch.flexmark.util.sequence.BasedOptionsSequence;
import net.serenitybdd.screenplay.targets.Target;

public class SwagLabsPath {

    public static Target VALIDATE_PRODUCT_PRICE =
            Target.the("validate product price")
                    .locatedBy("//div[@class='item_pricebar']/div[@class='inventory_item_price']");

    public static Target ENTER_USER_NAME = Target.the("enter user name")
            .locatedBy("//*[@id=\"user-name\"]");
    public static Target ENTER_USER_PASSWORD = Target.the("enter user password")
            .locatedBy("//*[@id=\"password\"]");
    public static Target CLICK_LOGIN_BUTTON = Target.the("click on the login button")
            .locatedBy("//*[@id=\"login-button\"]");
    public static Target SELECT_PRODUCT_CATEGORY = Target.the("select product category")
            .locatedBy("//select[@class=\"product_sort_container\"]/option[text()='{0}']");
    public static Target SELECT_PRODUCT = Target.the("select the product")
            .locatedBy("(//div[@class='inventory_item'])[{0}]//button");
    public static Target CLICK_ON_THE_CART = Target.the("click on the cart")
            .locatedBy("//*[@id=\"shopping_cart_container\"]/a");
    public static Target CLICK_CHECKOUT_BUTTON = Target.the("click on the checkout button")
            .locatedBy("//*[@id=\"checkout\"]");
    public static Target ENTER_USER_FIRST_NAME = Target.the("enter user first name")
            .locatedBy("//*[@id=\"first-name\"]");
    public static Target ENTER_USER_LAST_NAME = Target.the("enter user last name")
            .locatedBy("//*[@id=\"last-name\"]");
    public static Target ENTER_USER_ZIP_CODE = Target.the("enter user zip code")
            .locatedBy("//*[@id=\"postal-code\"]");
    public static Target CLICK_ON_THE_CONTINUE_BUTTON = Target.the("click on the continue button")
            .locatedBy("//*[@id=\"continue\"]");
    public static Target CLICK_ON_THE_FINISH_BUTTON = Target.the("click on the finish button")
            .locatedBy("//*[@id=\"finish\"]");
    public static Target CLICK_ON_THE_BACK_HOME_BUTTON = Target.the("click on the back home button")
            .locatedBy("//*[@id=\"back-to-products\"]");
    public static Target CLICK_ON_THE_MENU_BUTTON = Target.the("click on the menu button")
            .locatedBy("//*[@id=\"react-burger-menu-btn\"]");
    public static Target CLICK_LOG_OUT_BUTTON = Target.the("click on the logout button")
            .locatedBy("//*[@id=\"logout_sidebar_link\"]");
}
