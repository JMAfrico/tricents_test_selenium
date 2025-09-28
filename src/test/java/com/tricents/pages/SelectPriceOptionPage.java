package com.tricents.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Classe responsável por localizar os elementos da guia Select Price Option
 */
public class SelectPriceOptionPage {

	WebDriver driver;
	private WebDriverWait wait;
	
	public SelectPriceOptionPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Select Price Option']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuSelectPriceOptionActive;

	@FindBy(xpath = "//table[@id='priceTable']//following::input[@id='selectgold']//ancestor::label")
	private WebElement rdbSelectPriceOption;
	
	@FindBy(xpath = "//button[@id='nextsendquote']")
	private WebElement btnNextSendQuote;
	
	public void verificarSeMenuSelectPriceEstaAtivo() {
		boolean ativo = wait.until(ExpectedConditions.visibilityOf(menuSelectPriceOptionActive)).isDisplayed();
		Assert.assertTrue(ativo);
	}
	
	public void selecionarRadioButtonGold() {
		wait.until(ExpectedConditions.visibilityOf(rdbSelectPriceOption)).click();
	}

	public void clicarBotaoNextSendQuote() {
		wait.until(ExpectedConditions.visibilityOf(btnNextSendQuote)).click();
	}
}