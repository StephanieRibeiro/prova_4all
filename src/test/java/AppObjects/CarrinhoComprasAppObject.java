package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoComprasAppObject {
    private WebDriver driver;

    public CarrinhoComprasAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAumentaQtdBrigadeiroNoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-4-qtd"));
    }

    public WebElement getFinalizarCompraButton() {
        return this.driver.findElement(By.id("finish-checkout-button"));
    }
    public WebElement getAumentaQtdRissolesNoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-3-qtd"));
    }

    public WebElement getDiminuiQtdRissolesNoCarrinho() {
        return this.driver.findElement(By.id("remove-product-3-qtd"));
    }

}

