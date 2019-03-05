package AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {

    private WebDriver driver;

    public HomeAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getOpenCategoriesButton() {
        return this.driver.findElement(By.id("open-categories-btn"));
    }

    public WebElement getCategorieDocesButton() {
        return this.driver.findElement(By.id("category-1"));
    }

    public WebElement getCategorieTodosButton() {
        return this.driver.findElement(By.id("category-all"));
    }

    public WebElement getCartButton() {
        return this.driver.findElement(By.id("cart-btn"));
    }

    public WebElement getCategorieBebidasButton() {
        return this.driver.findElement(By.id("category-0"));
    }

    public WebElement getAddRissolesToCart() {
        return this.driver.findElement(By.id("add-product-3-btn"));
    }

}

