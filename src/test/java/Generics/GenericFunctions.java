package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilclass.RandomNumber;


import java.util.List;

    public class GenericFunctions extends PreConditions {

        public void search(String item) {
            driver.findElement(By.id("search")).sendKeys(item);
            driver.findElement(By.cssSelector(".dc-search-fieldset__submit-button")).click();
        }

        public String getPageTitle() {
            return driver.findElement(By.className("pageTitle")).getText();
        }

        public String getThumbNail() {
            return driver.findElement(By.className("current")).getText();
        }

        public String getCurrentUrl() {
            return driver.getCurrentUrl();
        }

        public String selectAnyProduct() {
            List<WebElement> productWebelements = driver.findElements(By.className("productTitle"));
            int productCount = productWebelements.size();
            int randomNumber = new RandomNumber().generateRandomNumber(productCount);
            String prouctSelected = productWebelements.get(randomNumber).getText();
            productWebelements.get(randomNumber).click();

            return prouctSelected;
        }

        public void addProductToBasket() {
            driver.findElement(By.cssSelector("#product-actions .channels .space-b")).click();
        }

        public String getProuctsInBasket() {
            return driver.findElement(By.cssSelector("div.productTitle")).getText();
        }

        public void selectPrice( ){
            driver.findElements(By.xpath("price"));

        }
    }














