package AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BebidasPageAppObject {

    private WebDriver driver;

    public BebidasPageAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddCocaColaToCartButton() {
        return this.driver.findElement(By.id("add-product-0-btn"));
    }

    public WebElement getAddFantaUvaToCartButton() {
        return this.driver.findElement(By.id("add-product-1-btn"));
    }

    public WebElement getAddAguaMineralToCartButton() {
        return this.driver.findElement(By.id("add-product-2-btn"));
    }


}

