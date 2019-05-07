package com.sapient.it.Applitools;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;

public class JeepSuiteApplitools2 {
	Eyes eyes;
	int count = 1;
	String[] str = null;

	@Test
	public void suite() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("a39B91bM19NMvdkaWFMecVDbotqn110HR1P6nP8P8amOc110");
		eyes.setForceFullPageScreenshot(true);
		eyes.setStitchMode(StitchMode.CSS);
		eyes.open(driver, "jeepusa3", "windowJeepSuite3", new RectangleSize(900, 600));
		driver.get("https://www.jeep.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement popUp = driver.findElement(By.xpath("//a[@data-lid='go-to-jeep-us']"));
		try {
			if (popUp.isDisplayed()) {
				popUp.click();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("no popup");
		}
		try {
			eyes.checkWindow("jeepBHPVLPPage" + count);
			List<WebElement> vehicleTag = driver.findElements(By.xpath("//span[text()='Vehicles']"));
			for (int i = 0; i < vehicleTag.size(); i++) {
				if (vehicleTag.get(i).isDisplayed()) {
					vehicleTag.get(i).click();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					break;
				}
			}
			List<WebElement> vehicleImg = driver
					.findElements(By.xpath("//div[div[text()='STANDARD MODELS']]/following-sibling::div//img"));
			for (int i = 0; i < vehicleImg.size(); i++) {
				count++;
				vehicleImg.get(i).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				eyes.checkWindow("jeepBHPVLPPage" + count);
				Thread.sleep(3000);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", vehicleTag.get(1));
			}
			List<WebElement> secNavElement = driver.findElements(By.xpath(
					"//div[@class='secondary-navigation--flat-bar']//div[contains(@class,'desktop-version')]//li"));
			for (int i = 0; i < secNavElement.size(); i++) {
				count++;
				secNavElement.get(i).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				eyes.checkWindow("jeepBHPVLPPage" + count);
				driver.navigate().back();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			eyes.close();
		} catch (Exception e) {
			e.printStackTrace();
			eyes.abortIfNotClosed();
		} finally {
			driver.close();
			System.exit(0);
		}
	}

}
