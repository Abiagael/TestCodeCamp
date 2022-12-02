import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Web_SignUp_Test {
    //Import the Selenium WebDriver
    private WebDriver driver;

    public void start(){
     //locate where the chrome driver is
     System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
     //1.open your Chrome browser
        driver = new ChromeDriver();
        //2.Input your Selenium Demo page URL(https://Selenium.blog.herokuapp.com)

    }

}
