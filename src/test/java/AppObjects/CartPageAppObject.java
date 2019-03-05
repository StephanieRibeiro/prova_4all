package AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageAppObject {
    private WebDriver driver;

    public CartPageAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddQtdBrigadeiroToCartButton() {
        return this.driver.findElement(By.id("add-product-4-qtd"));
    }

    public WebElement getFinalizarCompraButton() {
        return this.driver.findElement(By.id("finish-checkout-button"));
    }
    public WebElement getAddQtdRissolesToCartButton() {
        return this.driver.findElement(By.id("add-product-3-qtd"));
    }

    public WebElement getRemoveQtdRissolesToCart() {
        return this.driver.findElement(By.id("remove-product-3-qtd"));
    }

}

