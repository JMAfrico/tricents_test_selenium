package com.tricents.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Classe respons�vel por gerenciar o driver
 */
public class WebDriverManager {

	private WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public WebDriverManager() {
		
	}

	/**
	 * M�todo faz a chamada para a cria��o de um novo driver caso este n�o exista, ou retorna o drive caso j� exista
	 * @return driver
	 */
	public WebDriver getDriver() {
		if (driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	/**
	 * M�todo cria um novo driver
	 * @return driver
	 */
	private WebDriver createDriver() {
			driver = createLocalDriver();
			return driver;
	}

	/**
	 * M�todo responsavel pelas propriedades do driver a ser criado
	 * @return driver
	 */
	private WebDriver createLocalDriver() {
		System.setProperty(CHROME_DRIVER_PROPERTY, System.getProperty("user.dir")+"/libs/Drivers/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        op.setBinary(System.getProperty("user.dir")+"/libs/chrome-win64/chrome.exe");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		return driver;
	}

	/**
	 * M�todo finaliza o driver caso esteja sendo executado
	 */
	public void closeDriver() {
		if(driver != null) {
			driver.quit();
		}		
	}
}
