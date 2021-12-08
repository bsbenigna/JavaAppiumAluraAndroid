package aluraappium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;

public class FeatureCadastro {
    @Test
    public void CadastrarUsuarioComSenhasQueConferem() throws NoSuchElementException {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

        MobileElement botaoCadastrarUsuario = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastrarUsuario.click();
        MobileElement campoNome = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        campoNome.setValue("Be");
        MobileElement campoSenha = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        campoSenha.setValue("123");
        MobileElement campoConfirmarSenha = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        campoConfirmarSenha.setValue("123");
        MobileElement botaoCadastrar = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaoCadastrar.click();
        assertTrue(true);
    }

    @Test
    public void CadastrarUsuarioComSenhasQueNaoConferem(){
     AppiumDriver driver = AppiumDriverConfig.Instance().driver;
        MobileElement botaoCadastrarUsuario = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastrarUsuario.click();
        MobileElement campoNome = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        campoNome.setValue("Be");
        MobileElement campoSenha = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        campoSenha.setValue("123");
        MobileElement campoConfirmarSenha = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        campoConfirmarSenha.setValue("124");
        MobileElement botaocadastrar = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaocadastrar.click();
        MobileElement mensagemDeErro = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        assertEquals("Senhas não conferem",mensagemDeErro.getText());
        driver.navigate().back();
    }
}
















































