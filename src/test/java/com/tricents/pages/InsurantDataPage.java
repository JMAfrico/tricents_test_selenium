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
 * Classe responsável por localizar os elementos da guia Insurant Data
 */
public class InsurantDataPage {

	WebDriver driver;
	private WebDriverWait wait;
	
	public InsurantDataPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Enter Insurant Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterInsurantActive;
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement txtLastName;

	@FindBy(xpath = "//input[@id='birthdate']")
	private WebElement txtDateofBirth;

	@FindBy(xpath = "(//label[@class='ideal-radiocheck-label']//ancestor::label)[3]")
	private WebElement rdbGenderMale;
	
	@FindBy(xpath = "//input[@id='streetaddress']")
	private WebElement txtStreetAddress;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement selectCountry;

	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement txtZipCode;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement txtCity;

	@FindBy(xpath = "//select[@id='occupation']")
	private WebElement selectOccupation;

	@FindBy(xpath = "((//p[@class='group'])[3])//following::label[@class='ideal-radiocheck-label'][4]")
	private WebElement rdbHobbies;

	@FindBy(xpath = "((//p[@class='group'])[3])//following::label[@class='ideal-radiocheck-label'][5]")
	private WebElement rdbHobbies2;

	@FindBy(xpath = "//input[@id='website']")
	private WebElement txtWebsite;

	@FindBy(xpath = "//button[@id='open']")
	private WebElement Picture;
	
	@FindBy(xpath = "//button[@id='nextenterproductdata']")
	private WebElement btnNextEnterProductData;
	
	public void clicarBotaoNextEnterProductData() {
		wait.until(ExpectedConditions.visibilityOf(btnNextEnterProductData)).click();
	}

	public void verificarSeMenuEnterInsurantEstaAtivado() {
		boolean ativo = wait.until(ExpectedConditions.visibilityOf(menuEnterInsurantActive)).isDisplayed();
		Assert.assertTrue(ativo);
	}

	public void preencherNome(String nome) {
		wait.until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(nome);
	}

	public void preencherSobrenome(String sobrenome) {
		wait.until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(sobrenome);
	}

	public void preencherDataDeNascimento(String dataNascimento) {
		wait.until(ExpectedConditions.visibilityOf(txtDateofBirth)).sendKeys(dataNascimento);
	}

	public void selecionarRadioButtonGenero() {
		wait.until(ExpectedConditions.visibilityOf(rdbGenderMale)).click();
	}

	public void preencherEndereco(String endereco) {
		wait.until(ExpectedConditions.visibilityOf(txtStreetAddress)).sendKeys(endereco);
	}

	public void preencherNacionalidade(String nacionalidade) {
		wait.until(ExpectedConditions.visibilityOf(selectCountry)).sendKeys(nacionalidade);
	}

	public void preencherCodigoPostal(String cep) {
		wait.until(ExpectedConditions.visibilityOf(txtZipCode)).sendKeys(cep);
	}

	public void preencherCidade(String cidade) {
		wait.until(ExpectedConditions.visibilityOf(txtCity)).sendKeys(cidade);
	}

	public void preencherProfissao(String profissao) {
		wait.until(ExpectedConditions.visibilityOf(selectOccupation)).sendKeys(profissao);
	}

	public void preencherHobbies() {
		wait.until(ExpectedConditions.visibilityOf(rdbHobbies)).click();
		wait.until(ExpectedConditions.visibilityOf(rdbHobbies2)).click();
	}

	public void preencherWebsite(String site) {
		wait.until(ExpectedConditions.visibilityOf(txtWebsite)).sendKeys(site);
	}
}
