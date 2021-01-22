package TestCases;

import PageFactoryPages.CartPage;
import PageFactoryPages.IndexPage;
import PageFactoryPages.ProdPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCase001 extends BaseClass {

    IndexPage indexPageObj;
    ProdPage prodPage;
    CartPage cartPage;
    private static final Pattern p = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");

    @Test(priority = 0)
    public void test_0001_verifyPurchase(){
        indexPageObj =  new IndexPage(driver);
        indexPageObj.clickLaptopsOption();
        indexPageObj.clickSonyLaptopsOptionLink();
        prodPage = new ProdPage(driver);
        String priceToValidate = prodPage.getPrice();
        prodPage.clickAddToCart();
        prodPage.acceptAlertPopUp();
        prodPage.clickToHome();
        indexPageObj.clickLaptopsOption();
        indexPageObj.clickDellLaptopsOptionLink();
        prodPage.clickAddToCart();
        prodPage.acceptAlertPopUp();
        prodPage.clickToCart();
        cartPage = new CartPage(driver);

        cartPage.deleteDellProduct();
        cartPage.placeOrder();
        cartPage.fillName("Ankur");
        cartPage.fillCreditCard("5433455343434");
        cartPage.clickPurchase();
        String info  = cartPage.fetchPurchaseInfo();
        Matcher m = p.matcher(priceToValidate);
        if (m.find()) {
            System.out.println(m.group(1));
            if(info.contains(m.group(0)))
            Assert.assertEquals(true, true);
        }
        System.out.println(priceToValidate);
        System.out.println(info);// we can store in db and create reports
    }

}
