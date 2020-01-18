package com.bridgelabz.facebook.pages;

import com.bridgelabz.facebook.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//div[contains(text(),'Laxman Bhosale')]")
    WebElement userNameTestIconButton;

    @FindBy(xpath = "//img[@class='silhouette _11kf img']")
    WebElement userProfilePicIconButton;

    @FindBy(xpath = "//input[@id='js_1hb']")
    WebElement uploadPictureIconButton;

    @FindBy(xpath = "//button[@class='_4jy0 _4jy3 _4jy1 _51sy selected _42ft']")
    WebElement saveImageButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnUserNameIconButton() {
        userNameTestIconButton.click();
    }

    public void clickOnUserProfilePicIconButton() {
        userProfilePicIconButton.click();
    }
    public void clickOnsaveImageButton() {
        userNameTestIconButton.click();
    }
}
