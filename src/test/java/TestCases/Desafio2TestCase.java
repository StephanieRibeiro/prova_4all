package TestCases;

import Tasks.BebidasPageTask;
import Tasks.CartPageTask;
import Tasks.HomeTask;
import Tasks.ValidacoesTask;
import Util.Report;
import Util.ScreenShot;
import com.aventstack.extentreports.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        Report.log(Status.INFO, "Adiciona as bebidas ao carrinho", ScreenShot.capture(driver));
        homeTask.acessTodasCategorias();
        homeTask.addRissolesToCart();
        Report.log(Status.INFO, "Rissole adicionado ao carrinho", ScreenShot.capture(driver));
        homeTask.acessCart();
        Report.log(Status.INFO, "Acessa o carrinho", ScreenShot.capture(driver));
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        cartTask.addQtdRissolesToCart();
        Report.log(Status.INFO, "Aumenta em 9 a qtd de rissoles no carrinho", ScreenShot.capture(driver));
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        cartTask.rmvQtdRissolesToCart();
        Report.log(Status.INFO, "Diminui em 5 a qtd de rissoles no carrinho", ScreenShot.capture(driver));
//		validar de Qtd
        validacoes.isQtdRisoles();

        cartTask.finalizarCompras();
        Report.log(Status.INFO, "Finaliza compra Sucesso", ScreenShot.capture(driver));
//		validar msg Pedido Realizado com Sucesso! e clicar em fechar
        validacoes.isCompraSucesso();
        validacoes.isfecharPopUpMsgSucesso();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

