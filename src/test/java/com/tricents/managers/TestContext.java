package com.tricents.managers;

/**
 * Classe de contexto de cen�rios, responsavel por inst�nciar o drive que est� sendo utilizado e repassar o mesmo 
 * para o pr�ximo m�todo que ser� executado 
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
