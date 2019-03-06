package tasks;


import org.openqa.selenium.WebDriver;

import appObjects.BebidasAppObject;

public class BebidasTask {
    private BebidasAppObject bebidasAppObject;

    public BebidasTask(WebDriver driver) {
        this.bebidasAppObject = new BebidasAppObject(driver);
    }

    public void adicionaBebidasAoCarrinho() {
        bebidasAppObject.getAdicionaCocaColaAoCarrinhoButton().click();
        bebidasAppObject.getAdicionaFantaUvaAoCarrinhoButton().click();
        bebidasAppObject.getAdicionaAguaMineralAoCarrinhoButton().click();
    }

}
