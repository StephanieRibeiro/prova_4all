package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidacoesAppObject {
    private WebDriver driver;

    public ValidacoesAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMensagemSucessoLabel(){
        return this.driver.findElement(By.cssSelector("h2[class*='jyncPa']"));
    }

    public WebElement getFecharPopUpMensagemButton(){
        return this.driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div/button"));
    }
    public WebElement getQtdRisolesLabel(){
        return this.driver.findElement(By.id("product-3-qtd"));
    }

}
