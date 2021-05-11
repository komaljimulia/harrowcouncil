package harrowcouncil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseurl = "https://www.harrow.gov.uk/ ";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);
        String title= driver.getTitle();
        boolean verifyTitle = title.equals("https://www.harrow.gov.uk/");
        boolean verifyTitleContain= title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();


    }
}
