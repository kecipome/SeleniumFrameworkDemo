package testSuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.functions.Login;

public class Test_HomePage_Search {
	
	/*public WebDriver driver;  
    
    @BeforeClass  
    public void setUp() throws IOException{  
          
        Login login = new Login();  
        login.initSetup();  
        login.loginValid();  
        driver = login.driver;  
          
    }  
      
      
    @Test  
    public void test_searchGoods(){  
          
        HomePage hp = PageFactory.initElements(driver, HomePage.class);  
        hp.searchWithKeyword("Java");  
          
          
    }  */
    
    
    public static WebDriver driver;  
    
    @BeforeClass  
    public void setUp() throws IOException{  
          
        Login login = new Login();  
        login.initSetup();  
        login.loginValid();  
        driver = login.driver;  
          
    }  
      
      
    @Test  
    public void test_searchGoods(){  
          
        HomePage hp = PageFactory.initElements(driver, HomePage.class);  
        hp.searchWithKeyword("Java");  
          
          
    }  
      
    @AfterClass  
    public void tearDown() throws InterruptedException{  
          
        Thread.sleep(3000);  
    }  

}
