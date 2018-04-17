package testSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import pageObjects.JdHomePage;

public class TestWithPOM {
	WebDriver driver;  
    
    @BeforeClass  
    public void setUp() throws Exception{  
          
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.get("https://www.jd.com/");  
        Thread.sleep(2000);  
    }  
      
  
    @Test  
    public void testLogin(){  
          
     //   JdHomePage hp = PageFactory.initElements(driver, JdHomePage.class);  
      //  hp.login("user1", "123456");  
    }  
    
    
    
  /*  WebDriver driver;  
    
    @BeforeClass  
    public void setUp() throws Exception{  
          
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        driver = new ChromeDriver();    
        driver.manage().window().maximize();    
        driver.get("https://www.jd.com/");    
        Thread.sleep(2000);    
    }  
      
    @Test  
    public void testLogin(){  
          
        JdHomePage hp = new JdHomePage(driver);  
          
        hp.clickLoginLink();  
        hp.inputPassword("user1");  
        hp.inputUsername("123456");  
        hp.clickLoginBtn();  
          
    }  */

}
