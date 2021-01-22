package PageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    WebDriver driver;
    @FindBy(xpath = "//a[text() = 'Laptops']")
    WebElement laptops;

    @FindBy(xpath = "//a[text() = 'Sony vaio i5']")
    WebElement sonyLaptop;

    @FindBy(xpath = "//a[text() = 'Dell i7 8gb']")
    WebElement dellLaptop;


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

    public void clickDellLaptopsOptionLink() {
        dellLaptop.click();
    }
}
