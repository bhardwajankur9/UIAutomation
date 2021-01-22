package PageFactoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProdPage {
    WebDriver driver;

    @FindBy(xpath = "//a[text() = 'Add to cart']")
    WebElement addToCart;

    @FindBy(xpath = "//a[text() = 'Home ']")
    WebElement homeLink;

    @FindBy(xpath = "//a[text() = 'Cart']")
    WebElement cartLink;

    @FindBy(xpath = "//h3[@class = 'price-container']")
    WebElement valueOfSonyLaptop;


    public ProdPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptAlertPopUp(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public void clickToHome() {
        homeLink.click();
    }

    public void clickToCart() {
        cartLink.click();
    }

    public String getPrice() {
        return valueOfSonyLaptop.getText();
    }

}
