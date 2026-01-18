package new_employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class New_Employee {
	private WebDriver driver;
	private By pimButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
	private By addEmployeeBox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	private By firstName = By.name("firstName");
	private By middleName = By.name("middleName");
	private By lastName = By.name("lastName");
	private By saveButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");

	public New_Employee(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPIM() {
		driver.findElement(pimButton).click();
	}

	public void clickAddEmployee() {
		driver.findElement(addEmployeeBox).click();
		;
	}

	public void firstName(String fn) {
		driver.findElement(firstName).sendKeys(fn);
	}

	public void middleName(String mn) {
		driver.findElement(middleName).sendKeys(mn);
	}

	public void lastName(String ln) {
		driver.findElement(lastName).sendKeys(ln);
	}

	public void clicksave() {
		driver.findElement(saveButton).click();
	}
}
