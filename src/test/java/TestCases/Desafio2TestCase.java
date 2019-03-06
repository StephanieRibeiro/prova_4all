package testCases;

import tasks.BebidasTask;
import tasks.CarrinhoComprasTask;
import tasks.HomeTask;
import tasks.ValidacoesTask;
import util.Report;
import util.ScreenShot;
import com.aventstack.extentreports.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio2TestCase {
    private WebDriver driver;
    private HomeTask home;
    private BebidasTask bebidas;
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
        bebidas = new BebidasTask(driver);
        validacoes = new ValidacoesTask(driver);
    }

    @Test
    public void testMain() {

        home.acessaCategoriaBebidas();
        bebidas.adicionaBebidasAoCarrinho();
        Report.log(Status.INFO, "Adiciona as bebidas ao carrinho", ScreenShot.capture(driver));
        home.acessaTodasCategorias();
        home.adicionaRissolesAoCarrinho();
        Report.log(Status.INFO, "Rissole adicionado ao carrinho", ScreenShot.capture(driver));
        home.acessaCarrinhoCompras();
        Report.log(Status.INFO, "Acessa o carrinho", ScreenShot.capture(driver));
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        carrinhoCompras.aumentaQtdRissolesNoCarrinho();
        Report.log(Status.INFO, "Aumenta em 9 a qtd de rissoles no carrinho", ScreenShot.capture(driver));
        carrinhoCompras.diminuiQtdRissolesNoCarrinho();
        carrinhoCompras.diminuiQtdRissolesNoCarrinho();
        carrinhoCompras.diminuiQtdRissolesNoCarrinho();
        carrinhoCompras.diminuiQtdRissolesNoCarrinho();
        carrinhoCompras.diminuiQtdRissolesNoCarrinho();
        Report.log(Status.INFO, "Diminui em 5 a qtd de rissoles no carrinho", ScreenShot.capture(driver));
        validacoes.verificaQtdRisolesNoCarrinho();

        carrinhoCompras.finalizarCompras();
        Report.log(Status.INFO, "Finaliza compra Sucesso", ScreenShot.capture(driver));
        validacoes.validaMsgCompraSucesso();
        validacoes.fecharPopUpMsgSucesso();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

