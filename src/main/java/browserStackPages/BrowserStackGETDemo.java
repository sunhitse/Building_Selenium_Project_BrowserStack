package browserStackPages;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackGETDemo {

	WebDriver driver;

	@FindBy(xpath = "//h1")
	WebElement Header;

	@FindBy(xpath = "//button[@class='btn btn-secondary btn-lg col-md-3']")
	WebElement getdemo;
	
	@FindBy(xpath = "//*[@id=\"pcsf_form_fname_1\"]")
	WebElement name;

	@FindBy(xpath = "//*[@id=\"pcsf_form_email_1\"]")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"pcsf_form_company_1\"]")
	WebElement company;
	
	@FindBy(xpath = "//*[@id=\"pop_csf_option_1\"]")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"popUpCSFModalForm\"]/div[6]/div/div/input")
	WebElement getdemo1;

	public BrowserStackGETDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//public void veryHeader() {
		//String getheadertext = Header.getText().trim();
		//assertEquals("Create a FREE Account", getheadertext);
	//}

	public void getdemo() {
	getdemo.click();
}

	public void name(String arg1) {
		name.sendKeys(arg1);
	}

	
	public void enterBusinessEmail(String arg1) {
		email.sendKeys(arg1);
	}

	public void entercompany(String arg1) {
		company.sendKeys(arg1);
	}
	
	public void selectcheckbox() {
		checkbox.click();
	}
	
	public void selectgetdemo1() {
		getdemo1.click();
	}

}
