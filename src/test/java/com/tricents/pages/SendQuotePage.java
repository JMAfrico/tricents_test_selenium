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
 * Classe responsável por localizar os elementos da guia Send Quote
 */
public class SendQuotePage {

	WebDriver driver;
	private WebDriverWait wait; 
	
	public SendQuotePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[@name='Send Quote']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuSendQuoteActive;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEMail;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement txtPhone;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='confirmpassword']")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//textarea[@id='Comments']")
	private WebElement txtComments;
	
	@FindBy(xpath = "//button[@id='sendemail']")
	private WebElement btnSendEmail;
	
	@FindBy(xpath = "//h2[contains(text(),'Sending e-mail success!')]")
	private WebElement lblEmailSendSucess;

	public void verificarSeMenuSendQuoteEstaAtivo() {
		boolean ativo = wait.until(ExpectedConditions.visibilityOf(menuSendQuoteActive)).isDisplayed();
		Assert.assertTrue(ativo);
	}

	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEMail)).sendKeys(email);
	}

	public void preencherTelefone(String telefone) {
		wait.until(ExpectedConditions.visibilityOf(txtPhone)).sendKeys(telefone);
	}

	public void preencherUsuario(String usuario) {
		wait.until(ExpectedConditions.visibilityOf(txtUsername)).sendKeys(usuario);
	}

	public void preencherSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(senha);
	}

	public void preencherConfirmacaoDeSenha(String confirmacaoSenha) {
		wait.until(ExpectedConditions.visibilityOf(txtConfirmPassword)).sendKeys(confirmacaoSenha);
	}

	public void preencherComentariosAdicionais(String comentarios) {
		wait.until(ExpectedConditions.visibilityOf(txtComments)).sendKeys(comentarios);
	}

	public void clicarBotaoSendEmail() {
		wait.until(ExpectedConditions.visibilityOf(btnSendEmail)).click();
	}

	public void validarMensagemEmailEnviadoComSucesso() {
		boolean existe = wait.until(ExpectedConditions.visibilityOf(lblEmailSendSucess)).isDisplayed();
		Assert.assertTrue(existe);
	}
}
