/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import static java.lang.Thread.sleep;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Javi
 */
public class pruebaMoodle {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","/Users/Javi/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ieslluissimarro.org/moodle/login/index.php");
        //busca el element dels usuaris , el username
        WebElement element = driver.findElement(By.name("username"));

        //Lo que tiene que escribir en el campo de username
        element.sendKeys("jamoreno");
        
        WebElement element2 = driver.findElement(By.name("password"));

        //Lo que tiene que escribir en el campo de username
        element2.sendKeys("U");

        //Que clique el elemento del submit
        element.submit();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Entrar al modulo de web
        
        List<WebElement> elementos = driver.findElements(By.tagName("a"));
        
        String element3="";
        
        for (int i = 0; i < elementos.size(); i++) {
            //elementos.get(i).getAttribute("title");
            //System.out.println(elementos.get(i).getAttribute("title").toString());
            if (elementos.get(i).getAttribute("title").equals("2n DAM - Accés a dades (2017-2018)")){
                element3 = elementos.get(i).getAttribute("href");
                //System.out.println(element3);
            }
        }
        
        driver.navigate().to(element3);
        
    }
    
}
