package com.tricents.steps;

import com.tricents.managers.TestContext;
import com.tricents.pages.InsurantDataPage;
import io.cucumber.java.pt.Quando;

/**
 * Classe responsavel pela execução dos passos de teste das especificacoes dos arquivos ".feature", da guia Insurant Data
 */
public class InsurantDataStep {

	TestContext testContext;
	private InsurantDataPage insurantDataPage;
	
	public InsurantDataStep(TestContext testContext) {
		this.testContext = testContext;
		insurantDataPage = testContext.getPageObjectManager().getInsurantDataPage();
	}
	
	@Quando("verifico que estou na guia Insurant Data")
	public void verifico_que_estou_na_guia_insurant_data() {
		insurantDataPage.verificarSeMenuEnterInsurantEstaAtivado();
	}

	@Quando("digito o primeiro nome do cliente {string}")
	public void digito_o_primeiro_nome_do_cliente(String nome) {
		insurantDataPage.preencherNome(nome);
	}

	@Quando("digito o sobrenome do cliente {string}")
	public void digito_o_sobrenome_do_cliente(String sobrenome) {
		insurantDataPage.preencherSobrenome(sobrenome);
	}

	@Quando("digito a data de nascimento do cliente {string}")
	public void digito_a_data_de_nascimento_do_cliente(String data) {
		insurantDataPage.preencherDataDeNascimento(data);
	}

	@Quando("seleciono o genero do cliente masculino")
	public void seleciono_o_genero_do_cliente_masculino() {
		insurantDataPage.selecionarRadioButtonGenero();
	}

	@Quando("digito o endereco do cliente {string}")
	public void digito_o_endereco_do_cliente(String endereco) {
		insurantDataPage.preencherEndereco(endereco);
	}

	@Quando("seleciono o pais de nascimento do cliente {string}")
	public void seleciono_o_pais_de_nascimento_do_cliente(String pais) {
		insurantDataPage.preencherNacionalidade(pais);
	}

	@Quando("digito o cep do cliente {string}")
	public void digito_o_cep_do_cliente(String cep) {
		insurantDataPage.preencherCodigoPostal(cep);
	}

	@Quando("digito a cidade do cliente {string}")
	public void digito_a_cidade_do_cliente(String cidade) {
		insurantDataPage.preencherCidade(cidade);
	}

	@Quando("seleciono a {string} do cliente")
	public void seleciono_a_do_cliente(String profissao) {
		insurantDataPage.preencherProfissao(profissao);
	}

	@Quando("seleciono os hobbies do cliente")
	public void seleciono_os_hobbies_do_cliente(){
		insurantDataPage.preencherHobbies();
	}

	@Quando("digito o website do cliente {string}")
	public void digito_o_website_do_cliente(String site) {
		insurantDataPage.preencherWebsite(site);
	}

	@Quando("clico em next de insurant data")
	public void clico_em_next_de_insurant_data() {
		insurantDataPage.clicarBotaoNextEnterProductData();
	}
}
