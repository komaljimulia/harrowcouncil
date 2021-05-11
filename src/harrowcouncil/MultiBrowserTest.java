package harrowcouncil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserTest {
    static String browser= "firefox";
    static String baseurl = "https://www.harrow.gov.uk/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chroom")){
            System.setProperty("webdriver.chroom.driver","drivers/chromedriver.exe");
            driver= new ChromeDriver();
            driver.get(baseurl);
            driver.close();


        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("Title:" +driver.getTitle());
            driver.get(baseurl);
            driver.close();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            System.out.println("Title: "+driver.getTitle());
            driver.close();
        }else {
            System.out.println("Wrong browser name");
        }
    }




}
