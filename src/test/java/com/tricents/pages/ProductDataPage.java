package com.tricents.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Classe responsável por localizar os elementos da guia Product Data
 */
public class ProductDataPage {

	WebDriver driver;
	private WebDriverWait wait;
	
	public ProductDataPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//a[@name='Enter Product Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterProductDataActive;
	
	@FindBy(xpath = "//input[@id='startdate']")
	private WebElement txtStartDate;
	
	@FindBy(xpath = "//select[@id='insurancesum']")
	private WebElement selectInsuranceSum;
	
	@FindBy(xpath = "//select[@id='meritrating']")
	private WebElement selectMeritRating;
	
	@FindBy(xpath = "//select[@id='damageinsurance']")
	private WebElement selectDamageInsurance;
	
	@FindBy(xpath = "//input[@id='EuroProtection']//ancestor::div[@class='field idealforms-field idealforms-field-checkbox']")
	private WebElement rdbOptionalProducts;
	
	@FindBy(xpath = "//select[@id='courtesycar']")
	private WebElement selectCourtesyCar;
	
	@FindBy(xpath = "//button[@id='nextselectpriceoption']")
	private WebElement btnNextSelectPriceOption;
	
	public void getMenuEnterProductDataIsActive() {
		boolean ativo = wait.until(ExpectedConditions.visibilityOf(menuEnterProductDataActive)).isDisplayed();
		Assert.assertTrue(ativo);
	}

	public void preencherDataInicial(String data) {
		wait.until(ExpectedConditions.visibilityOf(txtStartDate)).sendKeys(data);
	}

	public void selecionarPrecoDoSeguro(String valor) {
		wait.until(ExpectedConditions.visibilityOf(selectInsuranceSum)).sendKeys(valor);

	}

	public void selecionarClassificacaoDoSeguro(String classificacao) {
		WebElement listClassificacaoSeguro = wait.until(ExpectedConditions.visibilityOf(selectMeritRating));
		Select selecionarObjeto = new Select(listClassificacaoSeguro);
		selecionarObjeto.selectByValue(classificacao);
	}

	public void selecionarCoberturaDoSeguro(String opcao) {
		WebElement listCoberturaSeguro = wait.until(ExpectedConditions.visibilityOf(selectDamageInsurance));
		Select selecionarObjeto = new Select(listCoberturaSeguro);
		selecionarObjeto.selectByValue(opcao);
	}

	public void selecionarRadioButtonOpcoesDeProdutos() {
		wait.until(ExpectedConditions.visibilityOf(rdbOptionalProducts)).click();
	}

	public void selecionarCarroDeCortesia(String opcao) {
		WebElement listCarroCortesia = wait.until(ExpectedConditions.visibilityOf(selectCourtesyCar));
		Select selecionarObjeto = new Select(listCarroCortesia);
		selecionarObjeto.selectByValue(opcao);
	}

	public void clicarBotaoNextSelectPriceOption() {
		wait.until(ExpectedConditions.visibilityOf(btnNextSelectPriceOption)).click();
	}
}
