package jogatina.buraco.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

class TelaInicialHomeTestSteps {
	AndroidSetup setup = new AndroidSetup();
	static AndroidDriver<AndroidElement> driver;


	@Before
	void setUp() throws Exception {
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
	}
	
	@Dado("^Dispositivo possui acesso a internet$")
	public void dispositivo_possui_acesso_a_internet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^Aplicativo est� carregado$")
	public void aplicativo_est�_carregado() throws Throwable {
		//driver = setup.prepareAndroidForAppium();
	}

	@Dado("^A l�ngua padr�o do dispositivo � ingl�s$")
	public void a_l�ngua_padr�o_do_dispositivo_�_ingl�s() throws Throwable {
		DesiredCapabilities additionalCapabilities = new DesiredCapabilities();
		additionalCapabilities.setCapability("language", "en");
		additionalCapabilities.setCapability("locale", "US");
		//driver = setup.prepareAndroidForAppium(additionalCapabilities);
	}

	@Quando("^Fechar a tela de an�ncio \"([^\"]*)\"$")
	public void fechar_a_tela_de_an�ncio(String arg1) throws Throwable {
		Thread.sleep(15000);
		driver.findElement(By.id("com.jogatina.buraco:id/buttonClose")).click();
		//waitForElement(driver.findElement(By.id("com.jogatina.buraco:id/buttonClose")));
	}

	@Quando("^O sistema carrega a tela inicial Home \"([^\"]*)\"$")
	public void o_sistema_carrega_a_tela_inicial_Home(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Entao("^Sistema exibe a label do elemento \"([^\"]*)\" como \"([^\"]*)\"$")
	public void sistema_exibe_a_label_do_elemento_como(String idDoBot�o, String labelEsperada) throws Throwable {
		assertEquals(labelEsperada, driver.findElement(By.id(idDoBot�o)).getText());
	}

	@Entao("^Sistema exibe a label do texto \"([^\"]*)\" como \"([^\"]*)\"$")
	public void sistema_exibe_a_label_do_texto_como(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^A l�ngua padr�o do dispositivo � portugu�s$")
	public void a_l�ngua_padr�o_do_dispositivo_�_portugu�s() throws Throwable {
		DesiredCapabilities additionalCapabilities = new DesiredCapabilities();
		additionalCapabilities.setCapability("language", "pt");
		additionalCapabilities.setCapability("locale", "BR");
		setup.prepareAndroidForAppium(additionalCapabilities);
	}

	@Quando("^O sistema carrega a tela inicial Home$")
	public void o_sistema_carrega_a_tela_inicial_Home() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Entao("^Sistema exibe elemento \"([^\"]*)\"$")
	public void sistema_exibe_elemento(String idDoElemento) throws Throwable {
		WebElement elemento = driver.findElement(By.id(idDoElemento));
	    assertNotNull(elemento);
	    assertTrue(elemento.isDisplayed());
	}


}
