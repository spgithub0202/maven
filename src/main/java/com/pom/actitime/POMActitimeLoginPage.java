package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.ExcelLibrary;

public class POMActitimeLoginPage implements AutoConstant
{
	@FindBy(xpath="//input[@name='username']")
    private WebElement usernameTextField;
    
    @FindBy(xpath="//input[@name='pwd']")
    private WebElement passwordTextField;
    
    @FindBy(id="loginButton")
    private WebElement loginsubmitButton;
    
    public POMActitimeLoginPage(WebDriver driver)
    {
   	 PageFactory.initElements(driver, this);
    }
    public void loginMethod() throws IOException
    {
   	 usernameTextField.sendKeys(ExcelLibrary.getCellValue(excelpath, sheetname, 1, 0));
   	 passwordTextField.sendKeys(ExcelLibrary.getCellValue(excelpath, sheetname, 1, 1));
   	// keepLoggedInCheckbox.click();
   	 loginsubmitButton.click();
    }
    
}
