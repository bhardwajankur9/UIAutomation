package PageFactoryPages;

public class ProdPage {
    WebDriver driver;
    @FindBy(xpath = "//a[text() = 'Add to cart']")
    WebElement addToCart;

    public ProdPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCart() {
        addToCart.click();
    }

}
