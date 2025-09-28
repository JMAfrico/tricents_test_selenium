package com.tricents.steps;

import com.tricents.managers.TestContext;
import com.tricents.pages.SendQuotePage;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

/**
 * Classe responsavel pela execução dos passos de teste das especificacoes dos arquivos ".feature", da guia Send Quote
 */
public class SendQuoteStep {

	TestContext testContext;
	private SendQuotePage sendQuotePage;
	
	public SendQuoteStep(TestContext testContext) {
		this.testContext = testContext;
		sendQuotePage = testContext.getPageObjectManager().getSendQuotePage();
	}
	
	@Quando("verifico que estou na guia Send Quote")
	public void verifico_que_estou_na_guia_send_quote() {
		sendQuotePage.verificarSeMenuSendQuoteEstaAtivo();
	}

	@Quando("digito o email do cliente {string}")
	public void digito_o_email_do_cliente(String email) {
		sendQuotePage.preencherEmail(email);
	}

	@Quando("digito o telefone do cliente {string}")
	public void digito_o_telefone_do_cliente(String telefone) {
		sendQuotePage.preencherTelefone(telefone);
	}

	@Quando("digito o nome de usuario do cliente {string}")
	public void digito_o_nome_de_usuario_do_cliente(String usuario) {
		sendQuotePage.preencherUsuario(usuario);
	}

	@Quando("digito a senha do cliente {string}")
	public void digito_a_senha_do_cliente(String senha) {
		sendQuotePage.preencherSenha(senha);
	}

	@Quando("digito a confirmacao de senha do cliente {string}")
	public void digito_a_confirmacao_de_senha_do_cliente(String confirmacaoSenha) {
		sendQuotePage.preencherConfirmacaoDeSenha(confirmacaoSenha);
	}
	
	@Quando("digito os {string} opcionais da solicitacao do cliente")
	public void digito_os_opcionais_da_solicitacao_do_cliente(String comentarios) {
		sendQuotePage.preencherComentariosAdicionais(comentarios);
	}
	
	@Quando("clico em Send de Send Quote")
	public void clico_em_send_de_send_quote() {
		sendQuotePage.clicarBotaoSendEmail();
	}

	@Entao("valido a cotacao enviada com sucesso")
	public void valido_a_cotacao_enviada_com_sucesso() {	
		sendQuotePage.validarMensagemEmailEnviadoComSucesso();
	}
}
