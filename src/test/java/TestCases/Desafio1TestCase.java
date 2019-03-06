package testCases;

import tasks.ValidacoesTask;
import util.Report;
import util.ScreenShot;
import com.aventstack.extentreports.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tasks.CarrinhoComprasTask;
import tasks.DocesTask;
import tasks.HomeTask;

public class Desafio1TestCase {
    private WebDriver driver;
    private HomeTask home;
    private DocesTask doces;
    private CarrinhoComprasTask carrinhoCompras;
    private ValidacoesTask validacoes;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://shopcart-challenge.4all.com/");
        driver.manage().window().maximize();

        home = new HomeTask(driver);
        carrinhoCompras = new CarrinhoComprasTask(driver);
        doces = new DocesTask(driver);
        validacoes = new ValidacoesTask(driver);

    }

    @Test
    public void testMain() {

        home.acessaCategoriaDoces();
        doces.adicionaDocesNoCarrinho();
        Report.log(Status.INFO, "Doces adicionados no carrinho", ScreenShot.capture(driver));
        home.acessaTodasCategorias();
        Report.log(Status.INFO, "Acessa todas as categorias", ScreenShot.capture(driver));
        home.acessaCarrinhoCompras();
        carrinhoCompras.aumentaQtdBrigadeirosNoCarrinho();
        carrinhoCompras.aumentaQtdBrigadeirosNoCarrinho();
        carrinhoCompras.aumentaQtdBrigadeirosNoCarrinho();
        carrinhoCompras.aumentaQtdBrigadeirosNoCarrinho();
        Report.log(Status.INFO, "Aumenta em 4 a quantidade de brigadeiros.", ScreenShot.capture(driver));
        carrinhoCompras.finalizarCompras();
        Report.log(Status.INFO, "Finaliza as compras", ScreenShot.capture(driver));
        validacoes.validaMsgCompraSucesso();
        Report.log(Status.INFO, "Mensagem de sucesso", ScreenShot.capture(driver));
        validacoes.fecharPopUpMsgSucesso();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

