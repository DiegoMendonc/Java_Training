package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploSelenium {
    public static void main(String[] args) {

        //Configurar o caminho do WebDriver
        System.setProperty("webdriver.chrome.driver", "caminho/para/o/chromedriver");

        // Criar uma instância do WebDriver
        WebDriver driver = new ChromeDriver();

        // Navegar para uma página web
        driver.get("https://www.google.com.br/");

        // Capturar o título da página e imprimir no console
        String titulo = driver.getTitle();
        System.out.println("Título da página: " + titulo);

        // Fechar o navegador
        driver.quit();
    }
}
