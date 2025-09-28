package com.tricents.steps;

import com.tricents.managers.TestContext;
import com.tricents.pages.VehicleDataPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

/**
 * Classe responsavel pela execução dos passos de teste das especificacoes dos arquivos ".feature", da guia Vehicle Data
 */
public class VehicleDataStep {
	
	TestContext testContext;
	private VehicleDataPage vehicleDataPage;
			
	public VehicleDataStep(TestContext testContext) {		
		this.testContext = testContext;
		vehicleDataPage = testContext.getPageObjectManager().getVehiclePage();
		vehicleDataPage.navegarParaHomePage();
	}
	
	@Dado("que estou no site de cotacao")
	public void que_estou_no_site_de_cotacao() {
		vehicleDataPage.verificoQueEstouNoSiteDeCotacao();
	}
	
	@Dado("verifico que estou na guia Vehicle Data")
	public void verifico_que_estou_na_guia_vehicle_data() {
		vehicleDataPage.verificarSeMenuEnterVehicleEstaAtivo();
	}

	@Quando("seleciono a marca do veiculo {string}")
	public void seleciono_a_marca_do_veiculo(String marca) {
		vehicleDataPage.preencherMarcaDoVeiculo(marca);
	}

	@Quando("digito a forca do motor do veiculo {string} KW")
	public void digito_a_forca_do_motor_do_veiculo_kw(String forca) {
		vehicleDataPage.preencherForcaDoMotor(forca);
	}

	@Quando("seleciono a data de fabricacao do veiculo {string}")
	public void seleciono_a_data_de_fabricacao_do_veiculo(String data) {
		vehicleDataPage.preencherDataDeFabricacao(data);
	}

	@Quando("seleciono o numero de assentos do veiculo {string}")
	public void seleciono_o_numero_de_assentos_do_veiculo(String numeroAssentos) {
		vehicleDataPage.preencherNumeroDeAssentos(numeroAssentos);
	}

	@Quando("seleciono o tipo de combustivel do veiculo {string}")
	public void seleciono_o_tipo_de_combustivel_do_veiculo(String tipoCombustivel) {
		vehicleDataPage.selecionarTipoDeCombustivel(tipoCombustivel);
	}

	@Quando("digito o preco de tabela do veiculo {string}")
	public void digito_o_preco_de_tabela_do_veiculo(String precoTabela) {
		vehicleDataPage.preencherPrecoDeTabela(precoTabela);
	}

	@Quando("digito o numero da placa do veiculo {string}")
	public void digito_o_numero_da_placa_do_veiculo(String placa) {
		vehicleDataPage.preencherNumeroDaPlaca(placa);
	}

	@Quando("digito a quilometragem do veiculo {string}")
	public void digito_a_quilometragem_do_veiculo(String quilometragem) {
		vehicleDataPage.preencherQuilometragemAtual(quilometragem);
	}

	@Quando("clico em next de vehicle data")
	public void clico_em_next_de_vehicle_data() {
		vehicleDataPage.clicarBotaoNext();
	}
	
	@Quando("seleciono a modelo do veiculo {string}")
	public void seleciono_a_modelo_do_veiculo(String modelo) {
		vehicleDataPage.selecionarModelo(modelo);
	}

	@Quando("digito a cilindrada do veiculo {string} ccm")
	public void digito_a_cilindrada_do_veiculo_ccm(String cilindradas) {
		vehicleDataPage.preencherCapacidadeCilindradas(cilindradas);
	}

	@Quando("seleciono a opcao de motorista conduz pelo lado direito")
	public void seleciono_a_opcao_de_motorista_conduz_pelo_lado_direito() {
		vehicleDataPage.selecionarMotoristaDirigeLadoDireito();
	}

	@Quando("seleciono o numero de assentos do lado do motorista {string}")
	public void seleciono_o_numero_de_assentos_do_lado_do_motorista(String assentosMotorista) {
		vehicleDataPage.selecionarNumeroDeAssentosLadoMotorista(assentosMotorista);
	}

	@Quando("digito a carga util do veiculo {string}")
	public void digito_a_carga_util_do_veiculo(String cargaUtil) {
		vehicleDataPage.preecherCargaUtil(cargaUtil);
	}

	@Quando("digito o peso do veiculo {string}")
	public void digito_o_peso_do_veiculo(String pesoTotal) {
		vehicleDataPage.preencherPesoTotal(pesoTotal);
	}
}
