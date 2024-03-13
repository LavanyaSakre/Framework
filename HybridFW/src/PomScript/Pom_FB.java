package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericScript.Basepage;

public class Pom_FB extends Basepage
{
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement lgn;
	
	public Pom_FB(WebDriver driver)
	{
		super(driver);
	}
	 public void username(String un)
	 {
		 uname.sendKeys(un);
	 }
	 public void pass(String pd)
	 {
		 pwd.sendKeys(pd);
	 }
	 public void login()
	 {
		 lgn.click();
	 }

}
