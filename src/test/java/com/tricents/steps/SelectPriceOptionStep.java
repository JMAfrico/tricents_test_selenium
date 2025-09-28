package com.tricents.steps;

import com.tricents.managers.TestContext;
import com.tricents.pages.SelectPriceOptionPage;

import io.cucumber.java.pt.Quando;

/**
 * Classe responsavel pela execução dos passos de teste das especificacoes dos arquivos ".feature", da guia Select Price Option
 */
public class SelectPriceOptionStep {

	TestContext testContext;
	private SelectPriceOptionPage selectPriceOptionPage;
	
	public SelectPriceOptionStep(TestContext testContext) {
		this.testContext = testContext;
		selectPriceOptionPage = testContext.getPageObjectManager().getSelectPriceOptionPage();
	}
	
	@Quando("verifico que estou na guia Select Price Option")
	public void verifico_que_estou_na_guia_select_price_option() {
		selectPriceOptionPage.verificarSeMenuSelectPriceEstaAtivo();
	}

	@Quando("seleciono a opcao de cotacao gold")
	public void seleciono_a_opcao_de_cotacao_gold() {
		selectPriceOptionPage.selecionarRadioButtonGold();
	}

	@Quando("clico em next de Select Price Option")
	public void clico_em_next_de_select_price_option(){
		selectPriceOptionPage.clicarBotaoNextSendQuote();
	}
}
