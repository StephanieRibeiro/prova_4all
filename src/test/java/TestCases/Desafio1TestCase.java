package TestCases;

import Tasks.ValidacoesTask;
import Util.Report;
import Util.ScreenShot;
import com.aventstack.extentreports.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tasks.CartPageTask;
import Tasks.DocesPageTask;
import Tasks.HomeTask;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Desafio1TestCase {
    private WebDriver driver;
    private HomeTask homeTask;
    private DocesPageTask docesTask;
    private CartPageTask cartTask;
    private ValidacoesTask validacoesTask;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://shopcart-challenge.4all.com/");

        homeTask = new HomeTask(driver);
        cartTask = new CartPageTask(driver);
        docesTask = new DocesPageTask(driver);
        validacoesTask= new ValidacoesTask(driver);

    }

    @Test
    public void testMain() {
        driver.manage().window().maximize();

        homeTask.acessCategoriaDoces();
        docesTask.addDocesToCart();
        Report.log(Status.INFO, "Doces adicionados no carrinho", ScreenShot.capture(driver));
        homeTask.acessTodasCategorias();
        Report.log(Status.INFO, "Acessa todas as categorias", ScreenShot.capture(driver));homeTask.acessCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.addQtdBrigadeirosToCart();
        Report.log(Status.INFO, "Aumenta em 4 a quantidade de brigadeiros.", ScreenShot.capture(driver));
        cartTask.finalizarCompras();
        Report.log(Status.INFO, "Finaliza as compras", ScreenShot.capture(driver));
        validacoesTask.isCompraSucesso();
        Report.log(Status.INFO, "Mensagem de sucesso", ScreenShot.capture(driver));
        validacoesTask.isfecharPopUpMsgSucesso();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

