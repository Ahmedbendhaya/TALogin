package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	private By btn_connexion= By.linkText("CONNEXION");
	private By txt_mail =By.id("inputEmail");
	private By txt_password= By.id("inputPassword");
	private By btn_connect= By.cssSelector("button[type*='submit']");
	private By Dashboard_display= By.className("container-fluid");
	private By Dashboard_no_displayed= By.id("ResetPassword");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Login_information(String username, String password){	
		driver.findElement(txt_mail).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
	}
	public void connect(){	
		driver.findElement(btn_connect).click();
	}
	public void AccessLogin() {
		driver.findElement(btn_connexion).click();
}
	public void Verifyconncorrect() {
		driver.findElement(Dashboard_display).isDisplayed();
		}
	public void VerifyconnIncorrect() {
		driver.findElement(Dashboard_no_displayed).isDisplayed();
		}
	}