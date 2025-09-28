package com.tricents.runners;

/**
 * Classe do tipo JUnit para execu��o dos cenarios
 */
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * features: localizacao do pacote onde est�o armazenados os arquivos
 * ".features". glue: localizacao do pacote das classes steps. 
 * tags: Nome do cenario a ser executado. O nome da tag deve ser o mesmo nome da tag no arquivo ".feature" que ser� executado.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:tricentsFeatures", glue = "com.tricents.steps", tags = "@cotacao_com_sucesso")
public class TricentsRunner {

}
