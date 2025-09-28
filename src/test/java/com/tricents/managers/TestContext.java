package com.tricents.managers;

/**
 * Classe de contexto de cenários, responsavel por instânciar o drive que está sendo utilizado e repassar o mesmo 
 * para o próximo método que será executado 
 */
public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext(){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
