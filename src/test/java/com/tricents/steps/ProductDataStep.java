package com.tricents.steps;

import com.tricents.managers.TestContext;
import com.tricents.pages.ProductDataPage;

import io.cucumber.java.pt.Quando;

/**
 * Classe responsavel pela execução dos passos de teste das especificacoes dos arquivos ".feature", da guia Product Data
 */
public class ProductDataStep {

	TestContext testContext;
	private ProductDataPage productDataPage;
	
	public ProductDataStep(TestContext testContext) {
		this.testContext = testContext;
		productDataPage = testContext.getPageObjectManager().getProductDataPage();
	}
	
	@Quando("verifico que estou na guia Product Data")
	public void verifico_que_estou_na_guia_product_data() {
		productDataPage.getMenuEnterProductDataIsActive();
	}

	@Quando("seleciono a data inicial {string}")
	public void seleciono_a_data_inicial(String data) {
		productDataPage.preencherDataInicial(data);
	}

	@Quando("seleciono a soma do seguro {string}")
	public void seleciono_a_soma_do_seguro(String valor) {
		productDataPage.selecionarPrecoDoSeguro(valor);
	}

	@Quando("seleciono a classificacao do seguro {string}")
	public void seleciono_a_classificacao_do_seguro(String classificacao) {
		productDataPage.selecionarClassificacaoDoSeguro(classificacao);
	}

	@Quando("seleciono a {string} de seguro contra danos")
	public void seleciono_a_de_seguro_contra_danos(String opcao) {
		productDataPage.selecionarCoberturaDoSeguro(opcao);
	}

	@Quando("seleciono algum item de produto adicional")
	public void seleciono_algum_item_de_produto_adicional() {
		productDataPage.selecionarRadioButtonOpcoesDeProdutos();
	}

	@Quando("seleciono a {string} de carro de cortesia")
	public void seleciono_a_de_carro_de_cortesia(String opcao) {
		productDataPage.selecionarCarroDeCortesia(opcao);
	}

	@Quando("clico em next de product data")
	public void clico_em_next_de_product_data() {
		productDataPage.clicarBotaoNextSelectPriceOption();
	}
}
