package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {

    private WebDriver driver;

    public HomeAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAbreCategoriasButton() {
        return this.driver.findElement(By.id("open-categories-btn"));
    }

    public WebElement getCategoriaDocesButton() {
        return this.driver.findElement(By.id("category-1"));
    }

    public WebElement getCategoriaTodosButton() {
        return this.driver.findElement(By.id("category-all"));
    }

    public WebElement getCarrinhoButton() {
        return this.driver.findElement(By.id("cart-btn"));
    }

    public WebElement getCategoriaBebidasButton() {
        return this.driver.findElement(By.id("category-0"));
    }

    public WebElement getAdicionaRissolesAoCarrinho() {
        return this.driver.findElement(By.id("add-product-3-btn"));
    }

}

