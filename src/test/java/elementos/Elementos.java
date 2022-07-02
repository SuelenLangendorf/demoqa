package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By userName = By.xpath("//input[@id='userName']");

	public By email = By.xpath("//input[@id='userEmail']");

	public By current = By.id("currentAddress");

	public By permanent = By.id("permanentAddress");

	public By submit = By.xpath("//button[@class='btn btn-primary']");
	
	public By nameCapturado = By.id("name");

}
