package jogatina.buraco.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.mobile.NetworkConnection.ConnectionType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Criada para preparar o ambiente. Reconhecer o aplicativo, inciar o driver.
 * @author guilh
 *
 */
public class AndroidSetup {

	//protected AndroidDriver<AndroidElement> driver;
	protected static AndroidDriver<AndroidElement> driver;

	// Prepara o ambiente
	protected void prepareAndroidForAppium() throws MalformedURLException {
		File f = new File("src");
		File fs = new File(f, "base.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		// capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.8.1");

		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	// Utilizar quando se quiser capabilities adicionais. Caso passe Device Name,
	// Appium Version ou APP, serão sobrescritas.
	protected void prepareAndroidForAppium(DesiredCapabilities capabilities) throws MalformedURLException {
		// má prática
		File f = new File("src");
		File fs = new File(f, "base.apk");

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		// capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.8.1");
		// package no emulador: package:com.jogatina.buraco
		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	protected MobileElement waitForElement(MobileElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 15);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static void wifiOff() {
		NetworkConnection mobileDriver = (NetworkConnection) driver;
		if (mobileDriver.getNetworkConnection() != ConnectionType.AIRPLANE_MODE) {
			mobileDriver.setNetworkConnection(ConnectionType.AIRPLANE_MODE);
		}
	}

/*
	protected void ajustaConexao(String statusDesejado) {
		ConnectionState con = driver.getConnection();

		if (statusDesejado.equals("AIRPLANE")) {
			if (con.isAirplaneModeEnabled()) {
				
			} con.

		}
	} */

}
