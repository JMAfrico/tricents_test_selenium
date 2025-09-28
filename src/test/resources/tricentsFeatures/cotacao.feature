#language: pt

Funcionalidade: Cotacao
  Como usuario comum do site, quero fazer uma cotacao de um veiculo

  @cotacao_com_sucesso
  Esquema do Cenario: Cotacao com sucesso
    Dado que estou no site de cotacao
    E verifico que estou na guia Vehicle Data
    Quando seleciono a marca do veiculo "Nissan"
    E seleciono a modelo do veiculo "Moped"
    E digito a cilindrada do veiculo "125" ccm
    E digito a forca do motor do veiculo "500" KW
    E seleciono a data de fabricacao do veiculo "01/08/2000"
    E seleciono o numero de assentos do veiculo "2"
    E seleciono a opcao de motorista conduz pelo lado direito
    E seleciono o numero de assentos do lado do motorista "1"
    E seleciono o tipo de combustivel do veiculo "Petrol"
    E digito a carga util do veiculo "50"
    E digito o peso do veiculo "4000"
    E digito o preco de tabela do veiculo "25000"
    E digito o numero da placa do veiculo "HKF2258C"
    E digito a quilometragem do veiculo "75000"
    E clico em next de vehicle data
    E verifico que estou na guia Insurant Data
    E digito o primeiro nome do cliente "Luan"
    E digito o sobrenome do cliente "Souza"
    E digito a data de nascimento do cliente "02/02/2000" 
    E seleciono o genero do cliente masculino
    E digito o endereco do cliente "Rua das aguas"
    E seleciono o pais de nascimento do cliente "Brasil"
    E digito o cep do cliente "04485554"
    E digito a cidade do cliente "Sao Paulo"
    E seleciono a <profissao> do cliente
    E seleciono os hobbies do cliente
    E digito o website do cliente "www.github.com"
    E clico em next de insurant data
    E verifico que estou na guia Product Data
    E seleciono a data inicial "10/10/2025"
    E seleciono a soma do seguro "10 mil"
    E seleciono a classificacao do seguro "Super Bonus"
    E seleciono a <opcaoSeguro> de seguro contra danos 
    E seleciono algum item de produto adicional
    E seleciono a <opcaoCortesia> de carro de cortesia


    
    Exemplos: 
    |profissao	 |opcaoSeguro		|opcaoCortesia|comentarios				|
    |"Unemployed"|"No Coverage" |"No" 				|"Thanks Accenture" |

