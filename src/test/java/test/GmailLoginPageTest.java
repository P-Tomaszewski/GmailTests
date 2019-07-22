package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GmailLoginPageObject;
import sun.rmi.runtime.Log;


public class GmailLoginPageTest {

    private static WebDriver driver = null;



    public static void main(String[] args) throws InterruptedException {

        GmailLoginPageTest();

    }

    public static void GmailLoginPageTest() throws InterruptedException {

            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriverold/chromedriver.exe");
            driver = new ChromeDriver();

            GmailLoginPageObject LoginGmail = new GmailLoginPageObject(driver);

            driver.get("https://accounts.google.com/signin/v2/identifier?hl=pl&passive=true&continue=https%3A%2F%2Fwww.google.pl%2F%3Fgws_rd%3Dssl&flowName=GlifWebSignIn&flowEntry=ServiceLogin");


            LoginGmail.insertLogin("jatylkozadajepytania@gmail.com");

            Thread.sleep(1000);

            LoginGmail.buttonDalej();

            Thread.sleep(3000);

            LoginGmail.insertPass("Tomaszewski11");

            Thread.sleep(1000);

            LoginGmail.buttonPassDalej();

            Thread.sleep(8000);

            driver.close();

    }

}
