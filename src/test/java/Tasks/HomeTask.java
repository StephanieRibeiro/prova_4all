package tasks;

import appObjects.HomeAppObject;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private HomeAppObject home;

    public HomeTask(WebDriver driver){
        this.home = new HomeAppObject(driver);
    }

    public void acessaCategoriaDoces() {
        home.getAbreCategoriasButton().click();
        home.getCategoriaDocesButton().click();
    }

    public void acessaCarrinhoCompras() {
        home.getCarrinhoButton().click();
    }
    public void acessaTodasCategorias() {
        home.getAbreCategoriasButton().click();
        home.getCategoriaTodosButton().click();
    }

    public void acessaCategoriaBebidas() {
        home.getAbreCategoriasButton().click();
        home.getCategoriaBebidasButton().click();
    }

    public void adicionaRissolesAoCarrinho() {
        home.getAdicionaRissolesAoCarrinho().click();
    }



}

