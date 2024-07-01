package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.ryanair.com")
public class RyanAirHomePage extends PageObject {
    public static final String LOGIN_BUTTON = "css:button[data-ref='myryanair-login--desktop']";
    public static final String SIGNUP_BUTTON = "css:button[data-ref='myryanair-register--desktop']";
    public static final String EMAIL_FIELD =  "css:input[data-ref='myryanair-auth--email']";
    public static final String PASSWORD_FIELD = "css:input[data-ref='myryanair-auth--password']";
    public static final String CREATE_ACCOUNT_BUTTON = "css:button[data-ref='myryanair-auth--register']";
}
