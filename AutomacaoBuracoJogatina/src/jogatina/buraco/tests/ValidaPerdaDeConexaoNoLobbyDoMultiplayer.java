package jogatina.buraco.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.mobile.NetworkConnection.ConnectionType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionState;

class ValidaPerdaDeConexaoNoLobbyDoMultiplayer extends AndroidSetup {

	@BeforeEach
	void setUp() throws Exception {
		// seta idioma português ao device
		DesiredCapabilities additionalCapabilities = new DesiredCapabilities();
		additionalCapabilities.setCapability("language", "en");
		additionalCapabilities.setCapability("locale", "US");

		// Prepara o driver
		prepareAndroidForAppium(additionalCapabilities);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@SuppressWarnings("unchecked")
	@Test
	void test() throws InterruptedException {
		String msgEsperada = "There was a communication error with the server. Please, try again later.";

		Thread.sleep(15000); // aguarda carregar o aplicativo

		waitForElement(driver.findElement(By.id("com.jogatina.buraco:id/buttonClose")));
		driver.findElement(By.id("com.jogatina.buraco:id/buttonClose")).click();

		Thread.sleep(10000); // aguarda carregar nova tela
		driver.findElement(By.id("com.jogatina.buraco:id/buttonMultiplayer")).click();

		Thread.sleep(10000); // aguarda carregar nova tela
		driver.findElement(By.id("com.jogatina.buraco:id/later_button")).click();

		NetworkConnection mobileDriver = (NetworkConnection) driver;
		mobileDriver.setNetworkConnection(ConnectionType.AIRPLANE_MODE);

		Thread.sleep(10000); // aguarda carregar nova tela
		driver.findElement(By.id("com.jogatina.buraco:id/buttonChooseBuracoAberto")).click();

		WebElement mensagemErroConexao = driver.findElement(By.id("com.jogatina.buraco:id/dialog_description"));
		assertEquals(msgEsperada, mensagemErroConexao.getText());

	}

}
