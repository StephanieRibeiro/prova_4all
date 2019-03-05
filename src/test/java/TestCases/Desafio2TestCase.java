package TestCases;

import Tasks.BebidasPageTask;
import Tasks.CartPageTask;
import Tasks.HomeTask;
import Tasks.ValidacoesTask;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import java.util.concurrent.TimeUnit;

public class Desafio2TestCase {
    private WebDriver driver;
    private HomeTask homeTask;
    private BebidasPageTask bebidasTask;
    private CartPageTask cartTask;
    private ValidacoesTask validacoes;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://shopcart-challenge.4all.com/");


        homeTask = new HomeTask(driver);
        cartTask = new CartPageTask(driver);
        bebidasTask = new BebidasPageTask(driver);
        validacoes = new ValidacoesTask(driver);



    }

    @Test
    public void testMain() {
        driver.manage().window().maximize();

        homeTask.acessCategoriaBebidas();
        bebidasTask.addBebidasToCart();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        homeTask.acessTodasCategorias();
        homeTask.addRissolesToCart();

        homeTask.acessCart();

        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();

        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
//		validar de Qtd
        validacoes.isQtdRisoles();

        cartTask.finalizarCompras();
//		validar msg Pedido Realizado com Sucesso! e clicar em fechar
        validacoes.isCompraSucesso();
        validacoes.isfecharPopUpMsgSucesso();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

