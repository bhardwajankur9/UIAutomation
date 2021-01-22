package PageFactoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;

    //label[text() = 'Country:']/following-sibling::input
    //label[text() = 'City:']/following-sibling::input
    //label[text() = 'Month:']/following-sibling::input
    //label[text() = 'Year:']/following-sibling::input

    @FindBy(xpath = "//td[text() = 'Dell i7 8gb']/following-sibling::td/a[text() = 'Delete']")
    WebElement deleteDell;

    @FindBy(xpath = "//div//button[text() = 'Place Order']")
    WebElement placeOrder;

    @FindBy(xpath = "//p[contains(text(), 'Id:')]")
    WebElement purchaseDescription;

    @FindBy(xpath = "//div//button[text() = 'OK']")
    WebElement clickOK;

    @FindBy(xpath = "//div//button[text() = 'Purchase']")
    WebElement purchase;

    @FindBy(xpath = "//label[text() = 'Name:']/following-sibling::input")
    WebElement setName;

    @FindBy(xpath = "//label[text() = 'Credit card:']/following-sibling::input")
    WebElement setCreditCard;


    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void deleteDellProduct() {
        Actions action = new Actions(driver);
        action.click(deleteDell).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//td[text() = 'Dell i7 8gb']/following-sibling::td/a[text() = 'Delete']")));
    }

    public void placeOrder() {
        placeOrder.click();
    }

    public void clickOK() {
        clickOK.click();
    }

    public void clickPurchase() {
        purchase.click();
    }

    public String fetchPurchaseInfo() {
        return purchaseDescription.getText();
    }

    public void fillName(String text) {
        setName.sendKeys(text);
    }

    public void fillCreditCard(String text) {
        setCreditCard.sendKeys(text);
    }

}
