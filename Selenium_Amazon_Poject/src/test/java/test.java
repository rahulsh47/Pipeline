import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class test {

        private WebDriver driver;
        ChromeOptions options;

        @BeforeTest
        public void LaunchAmazonHomePage(){
            options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
            options.addArguments("--window-size=1920x1080");
            driver = new ChromeDriver(options);
            String ExpTitle1 = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
            Assert.assertEquals(ExpTitle1,driver.getTitle()); //checking whether the correct page is loaded through Assert.
        }

        @Test(priority = 1)
        public void Searchboxclick(){
            WebElement searchInput = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchInput.click();
            searchInput.sendKeys("boat Headphone");
            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

            String ExpTitle = "Amazon.in : boat Headphone";
            Assert.assertEquals(ExpTitle,driver.getTitle());   //checking whether the correct page is loaded or not by comparing the title using Assertion.
        }

        @Test(priority = 2)
        public void firstsearch(){
            WebElement firstsearchItem1 = driver.findElement(By.cssSelector("div.puisg-col-inner\n"));
            firstsearchItem1.click();
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
        }

        @Test(priority = 3)
        public void Addtocart(){
            WebElement addToCartButton = driver.findElement(By.cssSelector("#add-to-cart-button"));
            addToCartButton.click();
        }

//        @Test(priority = 4)
//        public void proceedtoBuy(){
//            WebElement BuyItem = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
//            BuyItem.click();
//        }

        @AfterTest
        public void teardown(){
            driver.quit();
        }
}


