package com.tricents.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

/**
 * Classe respons�vel por localizar os elementos da guia Vehicle Data
 */
public class VehicleDataPage {

	WebDriver driver;
	private WebDriverWait wait;
	
	public VehicleDataPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Enter Vehicle Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterVehicleDataActive;
	
	@FindBy(xpath = "//select[@id='make']")
	private WebElement selectMake;
	
	@FindBy(xpath = "//select[@id='model']")
	private WebElement selectModel;
	
	@FindBy(xpath = "//input[@id='cylindercapacity']")
	private WebElement txtCylinderCapacity;
	
	@FindBy(xpath = "//input[@id='engineperformance']")
	private WebElement txtEnginePerform;
	
	@FindBy(xpath = "//input[@id='dateofmanufacture']")
	private WebElement txtDateofManufacture;
	
	@FindBy(xpath = "//select[@id='numberofseats']")
	private WebElement selectNumberofSeats;
	
	@FindBy(xpath = "(//p[@class='group']//following::label)[1]")
	private WebElement selectRightHandDrive;
	
	@FindBy(xpath = "//select[@id='numberofseatsmotorcycle']")
	private WebElement selectNumberofSeatsMotorcycle;
	
	@FindBy(xpath = "//select[@id='fuel']")
	private WebElement selectFuelType;
	
	@FindBy(xpath = "//input[@id='payload']")
	private WebElement txtPayload;

	@FindBy(xpath = "//input[@id='totalweight']")
	private WebElement txtTotalWeight;
	
	@FindBy(xpath = "//input[@id='listprice']")
	private WebElement txtListPrice;
	
	@FindBy(xpath = "//input[@id='licenseplatenumber']")
	private WebElement txtLicensePlateNumber;
	
	@FindBy(xpath = "//input[@id='annualmileage']")
	private WebElement txtAnnualMileage;
	
	@FindBy(xpath = "//button[@id='nextenterinsurantdata']")
	private WebElement btnNext;
	
	public void navegarParaHomePage() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	public void verificoQueEstouNoSiteDeCotacao() {
		Assert.assertEquals("https://sampleapp.tricentis.com/101/app.php",driver.getCurrentUrl());
	}	
	
	public void verificarSeMenuEnterVehicleEstaAtivo() {
		boolean ativo = wait.until(ExpectedConditions.visibilityOf(menuEnterVehicleDataActive)).isDisplayed();
		Assert.assertTrue(ativo);
	}
	
	public void selecionarModelo(String modelo) {
		WebElement listModelo = wait.until(ExpectedConditions.visibilityOf(selectModel));
		Select selecionarObjeto = new Select(listModelo);
		selecionarObjeto.selectByValue(modelo);
	}
	
	public void preencherCapacidadeCilindradas(String cilindradas) {
		wait.until(ExpectedConditions.visibilityOf(txtCylinderCapacity)).sendKeys(cilindradas);
	}

	public void selecionarMotoristaDirigeLadoDireito() {
		wait.until(ExpectedConditions.visibilityOf(selectRightHandDrive)).click();
	}

	public void selecionarNumeroDeAssentosLadoMotorista(String assentos) {
		WebElement listAssentos = wait.until(ExpectedConditions.visibilityOf(selectNumberofSeatsMotorcycle));
		Select selecionarObjeto = new Select(listAssentos);
		selecionarObjeto.selectByValue(assentos);
	}

	public void preecherCargaUtil(String cargaUtil) {
		wait.until(ExpectedConditions.visibilityOf(txtPayload)).sendKeys(cargaUtil);
	}

	public void preencherPesoTotal(String pesoTotal) {
		wait.until(ExpectedConditions.visibilityOf(txtTotalWeight)).sendKeys(pesoTotal);
	}

	public void clicarBotaoNext() {
		wait.until(ExpectedConditions.visibilityOf(btnNext)).click();
	}

	public void preencherForcaDoMotor(String forca) {
		wait.until(ExpectedConditions.visibilityOf(txtEnginePerform)).sendKeys(forca);
	}

	public void preencherDataDeFabricacao(String data) {
		wait.until(ExpectedConditions.visibilityOf(txtDateofManufacture)).sendKeys(data);
	}

	public void preencherNumeroDeAssentos(String numeroAssentos) {
		wait.until(ExpectedConditions.visibilityOf(selectNumberofSeats)).sendKeys(numeroAssentos);
	}

	public void selecionarTipoDeCombustivel(String tipoCombustivel) {
		WebElement listTipoCombustivel = wait.until(ExpectedConditions.visibilityOf(selectFuelType));
		Select selecionarObjeto = new Select(listTipoCombustivel);
		selecionarObjeto.selectByValue(tipoCombustivel);
	}

	public void preencherPrecoDeTabela(String precoTabela) {
		wait.until(ExpectedConditions.visibilityOf(txtListPrice)).sendKeys(precoTabela);
	}

	public void preencherNumeroDaPlaca(String numeroPlaca) {
		wait.until(ExpectedConditions.visibilityOf(txtLicensePlateNumber)).sendKeys(numeroPlaca);
	}

	public void preencherQuilometragemAtual(String quilometragem) {
		wait.until(ExpectedConditions.visibilityOf(txtAnnualMileage)).sendKeys(quilometragem);
	}

	public void preencherMarcaDoVeiculo(String marca) {
		WebElement listMarca = wait.until(ExpectedConditions.visibilityOf(selectMake));
		Select selecionarObjeto = new Select(listMarca);
		selecionarObjeto.selectByValue(marca);
	}
}
