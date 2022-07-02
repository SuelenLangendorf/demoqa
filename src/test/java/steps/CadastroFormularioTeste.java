package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class CadastroFormularioTeste {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	@After
	public void encerrarTeste() {
		Executa.fecharNavegador();
	}

	@Given("que o usuario esteja no formulario de cadastro")
	public void queOUsuarioEstejaNoFormularioDeCadastro() {
		metodos.scroll(0, 350);
		metodos.clicarTexto("h5", "Elements");
		metodos.clicarTexto("span", "Text Box");
	}

	@When("preencher todos os campos obrigatorios")
	public void preencherTodosOsCamposObrigatorios() {
		metodos.escrever(el.userName, "teste");
		metodos.escrever(el.email, "teste@teste.com");
		metodos.escrever(el.current, "teste");
		metodos.escrever(el.permanent, "teste");

	}

	@When("enviar os dados")
	public void enviarOsDados() {
		metodos.scroll(0, 300);
		metodos.clicar(el.submit);

	}

	@Then("validamos os dados cadastrados")
	public void validamosOsDadosCadastrados() {
		metodos.validarTexto("teste", el.nameCapturado);
		metodos.evidencia("CT-01 Cadastro enviado com sucesso");

	}

}
