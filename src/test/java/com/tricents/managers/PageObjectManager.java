package com.tricents.managers;

import org.openqa.selenium.WebDriver;

import com.tricents.pages.InsurantDataPage;
import com.tricents.pages.ProductDataPage;
import com.tricents.pages.SelectPriceOptionPage;
import com.tricents.pages.SendQuotePage;
import com.tricents.pages.VehicleDataPage;

/**
 * Classe responsavel por compartilhar o drive entre as chamadas dos Objects
 */
public class PageObjectManager {

	private WebDriver driver;
	private VehicleDataPage vehicleDataPage;
	private InsurantDataPage insurantDataPage;
	private ProductDataPage productDataPage;
	private SelectPriceOptionPage selectPriceOptionPage;
	private SendQuotePage sendQuotePage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public VehicleDataPage getVehiclePage(){
		return vehicleDataPage == null ? vehicleDataPage = new VehicleDataPage(driver) : vehicleDataPage;
	}
	
	public InsurantDataPage getInsurantDataPage(){
		return insurantDataPage == null ? insurantDataPage = new InsurantDataPage(driver) : insurantDataPage;
	}
	
	public ProductDataPage getProductDataPage() {
		return productDataPage == null ? productDataPage = new ProductDataPage(driver) : productDataPage;
	}
	
	public SelectPriceOptionPage getSelectPriceOptionPage() {
		return selectPriceOptionPage == null ? selectPriceOptionPage = new SelectPriceOptionPage(driver) : selectPriceOptionPage;
	}
	
	public SendQuotePage getSendQuotePage() {
		return sendQuotePage == null ? sendQuotePage = new SendQuotePage(driver) : sendQuotePage;
	}
}
