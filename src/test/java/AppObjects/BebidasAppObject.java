package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BebidasAppObject {

    private WebDriver driver;

    public BebidasAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAdicionaCocaColaAoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-0-btn"));
    }

    public WebElement getAdicionaFantaUvaAoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-1-btn"));
    }

    public WebElement getAdicionaAguaMineralAoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-2-btn"));
    }


}

