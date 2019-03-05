package Tasks;

import AppObjects.HomeAppObject;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private HomeAppObject home;

    public HomeTask(WebDriver driver){
        this.home = new HomeAppObject(driver);
    }

    public void acessCategoriaDoces() {
        home.getOpenCategoriesButton().click();
        home.getCategorieDocesButton().click();
    }

    public void acessCart() {
        home.getCartButton().click();
    }
    public void acessTodasCategorias() {
        home.getOpenCategoriesButton().click();
        home.getCategorieTodosButton().click();
    }

    public void acessCategoriaBebidas() {
        home.getOpenCategoriesButton().click();
        home.getCategorieBebidasButton().click();
    }

    public void addRissolesToCart() {
        home.getAddRissolesToCart().click();
    }



}

