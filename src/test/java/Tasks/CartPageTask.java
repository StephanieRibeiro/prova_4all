package Tasks;

import AppObjects.CartPageAppObject;
import org.openqa.selenium.WebDriver;

public class CartPageTask {

    private CartPageAppObject cartPage;

    public CartPageTask(WebDriver driver) {
        this.cartPage = new CartPageAppObject(driver);
    }

    public void addQtdBrigadeirosToCart() {
        cartPage.getAddQtdBrigadeiroToCartButton().click();

    }

    public void finalizarCompras() {
        cartPage.getFinalizarCompraButton().click();
    }

    public void addQtdRissolesToCart() {
        cartPage.getAddQtdRissolesToCartButton().click();
    }

    public void rmvQtdRissolesToCart() {
        cartPage.getRemoveQtdRissolesToCart().click();
    }

}

