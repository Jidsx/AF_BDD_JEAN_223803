import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
*
* @author Jean Israel
* @version 1.1
* @since Release 1.1 da aplicação
*/

public class Conta {

    /**
     * Passo Given para definir que o cliente deseja alugar um carro de luxo.
     * @throws Throwable se ocorrer um erro
     */
    @Given("^que o cliente deseja alugar um carro de luxo$")
    public void que_o_cliente_deseja_alugar_um_carro_de_luxo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Given para definir que o cliente realiza a reserva com antecedência de pelo menos uma semana.
     * @throws Throwable se ocorrer um erro
     */
    @Given("^o cliente realiza a reserva com antecedencia de pelo menos uma semana$")
    public void o_cliente_realiza_a_reserva_com_antecedencia_de_pelo_menos_uma_semana() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo When para definir que o cliente confirma a reserva.
     * @throws Throwable se ocorrer um erro
     */
    @When("^o cliente confirma a reserva$")
    public void o_cliente_confirma_a_reserva() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para verificar se o sistema oferece um desconto especial no valor total da locação.
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o sistema deve oferecer um desconto especial no valor total da locacao$")
    public void o_sistema_deve_oferecer_um_desconto_especial_no_valor_total_da_locacao() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para definir o valor original da locação.
     * @param arg1 Parte inteira do valor
     * @param arg2 Parte decimal do valor
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o valor original da locacao e de R\\$ (\\d+),(\\d+)$")
    public void o_valor_original_da_locacao_e_de_R$(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para definir o percentual de desconto especial.
     * @param arg1 Percentual de desconto
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o desconto especial e de (\\d+)%$")
    public void o_desconto_especial_e_de(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para definir o valor total da locação após o desconto.
     * @param arg1 Parte inteira do valor
     * @param arg2 Parte decimal do valor
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o valor total da locacao apos o desconto deve ser R\\$ (\\d+),(\\d+)$")
    public void o_valor_total_da_locacao_apos_o_desconto_deve_ser_R$(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Given para definir que o cliente deseja alugar um carro utilitário.
     * @throws Throwable se ocorrer um erro
     */
    @Given("^que o cliente deseja alugar um carro utilitario$")
    public void que_o_cliente_deseja_alugar_um_carro_utilitario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Given para definir que o cliente não possui uma reserva prévia.
     * @throws Throwable se ocorrer um erro
     */
    @Given("^o cliente nao possui uma reserva previa$")
    public void o_cliente_nao_possui_uma_reserva_previa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo When para definir que o cliente solicita a locação do carro utilitário.
     * @throws Throwable se ocorrer um erro
     */
    @When("^o cliente solicita a locacao do carro utilitario$")
    public void o_cliente_solicita_a_locacao_do_carro_utilitario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para verificar se o sistema encontra um veículo disponível.
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o sistema deve encontrar um veiculo disponivel$")
    public void o_sistema_deve_encontrar_um_veiculo_disponivel() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para verificar se o sistema processa a locação rapidamente.
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o sistema deve processar a locacao rapidamente$")
    public void o_sistema_deve_processar_a_locacao_rapidamente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para definir que o custo da locação deve ser um pouco mais elevado devido à demanda urgente e inesperada.
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o custo da locacao deve ser um pouco mais elevado devido a demanda urgente e inesperada$")
    public void o_custo_da_locacao_deve_ser_um_pouco_mais_elevado_devido_a_demanda_urgente_e_inesperada() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para definir o percentual de aumento de custo devido à urgência.
     * @param arg1 Percentual de aumento de custo
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o aumento de custo devido a urgencia e de (\\d+)%$")
    public void o_aumento_de_custo_devido_a_urgencia_e_de(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Passo Then para definir o valor total da locação.
     * @param arg1 Parte inteira do valor
     * @param arg2 Parte decimal do valor
     * @throws Throwable se ocorrer um erro
     */
    @Then("^o valor total da locacao deve ser R\\$ (\\d+),(\\d+)$")
    public void o_valor_total_da_locacao_deve_ser_R$(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
