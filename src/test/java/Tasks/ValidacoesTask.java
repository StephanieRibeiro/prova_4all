package tasks;

import appObjects.ValidacoesAppObject;
import org.openqa.selenium.WebDriver;

public class ValidacoesTask {
    private ValidacoesAppObject validacoes;

    public ValidacoesTask(WebDriver driver) {
        this.validacoes = new ValidacoesAppObject(driver);
    }

    public boolean validaMsgCompraSucesso(){
        return validacoes.getMensagemSucessoLabel().getText().contains("Pedido realizado com sucesso!");
    }

    public void fecharPopUpMsgSucesso(){
        validacoes.getFecharPopUpMensagemButton().click();
    }

    public void verificaQtdRisolesNoCarrinho(){
        validacoes.getQtdRisolesLabel().getText().equals("5");
    }


}
