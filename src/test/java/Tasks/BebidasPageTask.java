package Tasks;


import org.openqa.selenium.WebDriver;

import AppObjects.BebidasPageAppObject;

public class BebidasPageTask {
    private BebidasPageAppObject bebidasPage;

    public BebidasPageTask(WebDriver driver) {
        this.bebidasPage = new BebidasPageAppObject(driver);
    }

    public void addBebidasToCart() {
        bebidasPage.getAddCocaColaToCartButton().click();
        bebidasPage.getAddFantaUvaToCartButton().click();
        bebidasPage.getAddAguaMineralToCartButton().click();
    }

}
