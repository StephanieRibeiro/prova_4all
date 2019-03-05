package Tasks;

import org.openqa.selenium.WebDriver;

import AppObjects.DocesPageAppObject;

public class DocesPageTask {
    private DocesPageAppObject docesPage;

    public DocesPageTask(WebDriver driver){
        this.docesPage = new DocesPageAppObject(driver);
    }

    public void addDocesToCart() {
        docesPage.getAddBrigadeiroToCartButton().click();
        docesPage.getAddAlfajorToCartButton().click();
    }


}
