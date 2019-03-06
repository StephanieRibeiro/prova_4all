package tasks;

import appObjects.CarrinhoComprasAppObject;
import org.openqa.selenium.WebDriver;

public class CarrinhoComprasTask {

    private CarrinhoComprasAppObject cartPage;

    public CarrinhoComprasTask(WebDriver driver) {
        this.cartPage = new CarrinhoComprasAppObject(driver);
    }

    public void aumentaQtdBrigadeirosNoCarrinho() {
        cartPage.getAumentaQtdBrigadeiroNoCarrinhoButton().click();
    }

    public void finalizarCompras() {
        cartPage.getFinalizarCompraButton().click();
    }

    public void aumentaQtdRissolesNoCarrinho() {
        cartPage.getAumentaQtdRissolesNoCarrinhoButton().click();
    }

    public void diminuiQtdRissolesNoCarrinho() {
        cartPage.getDiminuiQtdRissolesNoCarrinho().click();
    }

}

