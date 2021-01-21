package PageFactoryPages;

public class IndexPage {

    WebDriver driver;
    @FindBy(xpath = "//a[text() = 'Laptops']")
    WebElement laptops;

    @FindBy(xpath = "//a[text() = 'Sony vaio i5']")
    WebElement sonyLaptop;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLaptopsOption() {
        laptops.click();
    }

    public void clickSonyLaptopsOptionLink() {
        sonyLaptop.click();
    }
}
