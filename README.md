## Projeto de automação em front end.

>### Tecnologias:

- Java - Versão SE 1.8<br> 
- Eclipse<br>
- Maven<br>
- Selenium<br>
- Cucumber<br>
- Junit<br>
- Gherkin

>### Padrões de projeto:
- Feature<br>
- Page Object<br>
- Steps<br>
- Managers<br>
- Runner<br>

>### Dependências do projeto:
- cucumber-java 6.9.0<br>
- cucumber-junit 6.9.0<br>
- selenium-java 4.1.1<br>
- junit 4.13.1<br>
- cucumber-picocontainer 6.11.0<br>

>### Como executar:
- 1º) Baixar ou clonar projeto
- 2º) Se você não tem instalado o "cucumber eclipse plugin" é necessário instalar. No Eclipse vá em Help>Eclipse MarketPlace>digite cucumber eclipse plugin e instale 
- 2º) Importar projeto no eclipse: Botao direito>import>maven>existing maven project>seleciona o projeto>finish
- 3º) Projeto compilado na versão 1.8 - Verificar versão do Java. Clicar com botão direito no projeto>Propriedades>Java Build Path>Libraries>JRE System Library>Edit>JSE1.8
- 4º) Ir na pasta src/test/resource> tricentsFeature> cotacao.feature. Apertar com o botão direito> Run As> cucumber feature  
ou<br>   src/test/java> com.tricents.runners>Tricents Runner. Apertar com o botao direito> Run As> Junit Test
