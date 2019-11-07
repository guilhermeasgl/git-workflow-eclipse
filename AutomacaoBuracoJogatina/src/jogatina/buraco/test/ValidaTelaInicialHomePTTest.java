package jogatina.buraco.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

class ValidaTelaInicialHomePTTest extends AndroidSetup {

	@BeforeEach
	void setUp() throws Exception {
		// seta idioma português ao device
		DesiredCapabilities additionalCapabilities = new DesiredCapabilities();
		additionalCapabilities.setCapability("language", "pt");
		additionalCapabilities.setCapability("locale", "BR");

		// Prepara o driver
		prepareAndroidForAppium(additionalCapabilities);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		Thread.sleep(15000);
		waitForElement(driver.findElement(By.id("com.jogatina.buraco:id/buttonClose")));

		driver.findElement(By.id("com.jogatina.buraco:id/buttonClose")).click();
		Thread.sleep(15000);

		String buttonMoreGames = driver.findElement(By.id("com.jogatina.buraco:id/buttonMoreGames")).getText();
		assertEquals("+JOGOS", buttonMoreGames);
		String buttonSingleplayer = driver.findElement(By.id("com.jogatina.buraco:id/buttonSingleplayer")).getText();
		assertEquals("JOGAR AGORA!", buttonSingleplayer);
		String buttonMultiplayer = driver.findElement(By.id("com.jogatina.buraco:id/buttonMultiplayer")).getText();
		assertEquals("MULTIPLAYER", buttonMultiplayer);
		// String textViewPlayersOnline =
		// driver.findElement(By.id("com.jogatina.buraco:id/textViewPlayersOnline")).getText();
		// assertEquals("jogadores online", textViewPlayersOnline);
		String textViewButtonVIPTitle = driver.findElement(By.id("com.jogatina.buraco:id/textViewButtonVIPTitle"))
				.getText();
		assertEquals("Dispute o Ranking!", textViewButtonVIPTitle);
		String textViewVipDetails = driver.findElement(By.id("com.jogatina.buraco:id/textViewVipDetails")).getText();
		assertEquals("Grátis por 7 dias, após R$ 9,99 / semana", textViewVipDetails);

	}

}
