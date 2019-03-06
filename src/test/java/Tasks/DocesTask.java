package tasks;

import org.openqa.selenium.WebDriver;

import appObjects.DocesAppObject;

public class DocesTask {
    private DocesAppObject docesPage;

    public DocesTask(WebDriver driver){
        this.docesPage = new DocesAppObject(driver);
    }

    public void adicionaDocesNoCarrinho() {
        docesPage.getAdicionaBrigadeiroAoCarrinhoButton().click();
        docesPage.getAdicionaAlfajorAoCarrinhoButton().click();
    }


}
