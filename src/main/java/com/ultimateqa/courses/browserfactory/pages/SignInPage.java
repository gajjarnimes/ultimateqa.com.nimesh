package com.ultimateqa.courses.browserfactory.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By Signin = By.xpath("//a[@href='/users/sign_in']");
    By WelcomeText  = By.xpath("//h2[@class='page__heading']");
    By EnterinvalidEmail=By.id("user[email]");
    By EnterinvalidPassword=By.id("user[password]");
    By signInButton = By.xpath("//button[contains(text(),'Sign in')]");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void clickOnSignin(){
        clickOnElement(Signin);
    }
    public String getWelcomeText(){
        return getTextFromElement(WelcomeText);
    }
    public void EnterinvalidEmail(String Email){
        sendTextToElement(EnterinvalidEmail,Email);
    }
    public void EnterinvalidPassword(String Password){
        sendTextToElement(EnterinvalidPassword,Password);
    }
    public void clickOnsignInButton(){
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
