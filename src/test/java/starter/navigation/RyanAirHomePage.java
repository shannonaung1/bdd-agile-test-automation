package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.ryanair.com")
public class RyanAirHomePage extends PageObject {
    public static final String COOKIE_POPUP_CLOSE_BUTTON = "css:button[data-ref=\"cookie.accept-all\"]";
    public static final String LOGIN_BUTTON = "css:button.ry-button--anchor-white.ry-button--anchor";
    public static final String SIGNUP_BUTTON = "css:button[data-ref=\"button.ry-button--anchor-white.ry-button--anchor\"]";
    public static final String EMAIL_FIELD =  "css:input[data-ref='myryanair-auth--email']";
    public static final String PASSWORD_FIELD = "css:input[data-ref='myryanair-auth--password']";
    public static final String CREATE_ACCOUNT_BUTTON = "css:button[data-ref='myryanair-auth--register']";
    public static final String COOKIE_POPUP = "css:div#cookie-popup-with-overlay";

}
