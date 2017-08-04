package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calcualtor {

	WebDriver wd;

	public calcualtor(WebDriver wd) {
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}
	
	
	@FindBy(id="com.android.calculator2:id/digit_1")
	public WebElement btn_1;
	
	@FindBy(id="com.android.calculator2:id/digit_2")
	public WebElement btn_2;
	
	@FindBy(id="com.android.calculator2:id/digit_3")
	public WebElement btn_3;
	
	@FindBy(id="com.android.calculator2:id/digit_4")
	public WebElement btn_4;
	
	@FindBy(id="com.android.calculator2:id/digit_5")
	public WebElement btn_5;
	
	@FindBy(id="com.android.calculator2:id/digit_6")
	public WebElement btn_6;
	
	@FindBy(id="com.android.calculator2:id/digit_7")
	public WebElement btn_7;
	
	@FindBy(id="com.android.calculator2:id/digit_8")
	public WebElement btn_8;
	
	@FindBy(id="com.android.calculator2:id/digit_9")
	public WebElement btn_9;
	
	@FindBy(id="com.android.calculator2:id/digit_0")
	public WebElement btn_0;
	
	@FindBy(id="com.android.calculator2:id/op_mul")
	public WebElement btn_mul;
	
}
