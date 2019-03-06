package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocesAppObject {
    private WebDriver driver;

    public DocesAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAdicionaBrigadeiroAoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-4-btn"));
    }

    public WebElement getAdicionaAlfajorAoCarrinhoButton() {
        return this.driver.findElement(By.id("add-product-5-btn"));
    }

}

