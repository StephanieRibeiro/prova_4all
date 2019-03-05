package TestCases;

import Tasks.ValidacoesTask;
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
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--headless");
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
        homeTask.acessTodasCategorias();
        homeTask.acessCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.addQtdBrigadeirosToCart();
        cartTask.finalizarCompras();
//		validar msg Pedido Realizado com Sucesso! e clicar em fechar
        validacoesTask.isCompraSucesso();
        validacoesTask.isfecharPopUpMsgSucesso();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

