package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl5 {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }@Test
    public void openYoutue(){
        driver.get("https://www.youtube.com");
    }@Test
    public void openAmazon(){
        driver.get("https://www.amazon.co.uk");
    }@Test
    public void openNewlook(){
        driver.get("https://www.newlook.com/uk/");
    }@Test
    public void openPrimark(){
        driver.get("https://www.primark.com");
    }@Test
    public void openRiverisland(){
        driver.get("https://www.riverisland.com");
    }@After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

}}
