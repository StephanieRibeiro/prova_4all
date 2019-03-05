package AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocesPageAppObject {
    private WebDriver driver;

    public DocesPageAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddBrigadeiroToCartButton() {
        return this.driver.findElement(By.id("add-product-4-btn"));
    }

    public WebElement getAddAlfajorToCartButton() {
        return this.driver.findElement(By.id("add-product-5-btn"));
    }

}

