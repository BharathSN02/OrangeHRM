package viewlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewEmpList {
	private WebDriver driver;
	private By listButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");

	public ViewEmpList(WebDriver driver) {
		this.driver = driver;
	}

	public void clickList() {
		driver.findElement(listButton).click();
	}

}
