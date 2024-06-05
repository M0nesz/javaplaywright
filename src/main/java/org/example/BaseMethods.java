package org.example;

public class BaseMethods extends PlaywrightFactory {
    public static  String USERNAME_FIELD = "#user-name";
    public static  String PASSWORD_FIELD = "#password";
    public static  String LOGIN_BUTTON = "#login-button";


    public static void login(){
        page.locator(USERNAME_FIELD).fill(BaseVariables.USER_NAME);
        page.locator(PASSWORD_FIELD).fill(BaseVariables.PASSWORD);
        page.locator(LOGIN_BUTTON).click();
    }
}
