package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GmailLoginPageObject {



    WebDriver driver = null;

    By insert_login = By.name("identifier");
    By button_dalej = By.id("identifierNext");
    By insert_pass = By.name("password");
    By buttonPass_dalej = By.id("passwordNext");
        public GmailLoginPageObject(WebDriver driver){
            this.driver = driver;
        }

        public void insertLogin(String text){

            driver.findElement(insert_login).sendKeys(text);
        }

        public void buttonDalej(){
            driver.findElement(button_dalej).sendKeys(Keys.RETURN);
        }

        public void insertPass(String text){

            driver.findElement(insert_pass).sendKeys(text);
        }

        public void buttonPassDalej(){
            driver.findElement(buttonPass_dalej).sendKeys(Keys.RETURN);
        }



}
