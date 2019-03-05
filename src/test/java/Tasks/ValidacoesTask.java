package Tasks;

import AppObjects.ValidacoesAppObject;
import org.openqa.selenium.WebDriver;

public class ValidacoesTask {
    private ValidacoesAppObject validacoes;

    public ValidacoesTask(WebDriver driver) {
        this.validacoes = new ValidacoesAppObject(driver);
    }

    public boolean isCompraSucesso (){
        return validacoes.getMensagemSucessoLabel().getText().contains("Pedido realizado com sucesso!");
    }

    public void isfecharPopUpMsgSucesso(){
        validacoes.getFecharPopUpMensagemButton().click();
    }

    public void isQtdRisoles(){
        validacoes.getQtdRisolesLabel().getText().equals("5");
    }


}
