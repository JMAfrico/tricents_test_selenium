## Projeto de automação em front end.

>### Tecnologias:

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
- selenium-java 4.35.0<br>
- junit 4.13.1<br>
- Chromium V139- https://storage.googleapis.com/chrome-for-testing-public/139.0.7258.138/win64/chrome-win64.zip
- Chromedriver - https://storage.googleapis.com/chrome-for-testing-public/139.0.7258.138/win64/chromedriver-win64.zip 

>### Como executar:
- 1º) Baixar ou clonar projeto
- 2º) Importar projeto no eclipse/Intellij
- 3º) Instalar "cucumber plugin"
- 4º) Instalar o chromium na versão 139(ver link em tópico dependencias). Baixar, extrair e adicionar a pasta no local "C:/Arquivos de programas"
- 4º) Ir na pasta src/test/resource> tricentsFeature> cotacao.feature. Apertar com o botão direito> Run As> cucumber feature  
ou<br>   src/test/java> com.tricents.runners>Tricents Runner. Apertar com o botao direito> Run As> Junit Test
