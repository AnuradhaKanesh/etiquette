import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class GSTSegregationTests {
    Product product1 = new Dresses();
    Product product2 = new Dresses();
    Product product3 = new Jewellery();
    Product product4 = new Jewellery();
    Product product5 = new Bags();
    Product product6 = new Bags();
    Product product7 = new Bags();
    Product product8 = new Bags();
    Product product9 = new Dresses();
    PriceCalculator priceCalculator = new PriceCalculator();
    ShopKeeper shopKeeper = new ShopKeeper();
    List<Product> products;

    @BeforeTest
    public void shopkeeperAddProducts() {
        shopKeeper.addProducts(product1, product2, product3, product4, product5, product6, product7, product8, product9);
    }


    @Test
    public void TC001_Verify_Product_Price_Is_GreaterThan_2000_Has_GST() {
        products = priceCalculator.extractProductGrtThan2000andGST(shopKeeper.productList);

        Assert.assertTrue(products.toString().contains("Jewellery")
                && !products.toString().contains("Bags")
                && !products.toString().contains("Dresses"));
    }

    @Test
    public void TC002_Verify_Products_Without_GST() {
        products = priceCalculator.extractProductWithoutGST(shopKeeper.productList);

        Assert.assertTrue(products.toString().contains("Dresses")
                && !products.toString().contains("Bags")
                && !products.toString().contains("Jewellery"));
    }

    @Test
    public void TC002_Verify_Products_With_GST() {
        products = priceCalculator.extractProductWithGST(shopKeeper.productList);

        Assert.assertTrue(!products.toString().contains("Dresses")
                && (products.toString().contains("Bags")
                || !products.toString().contains("Jewellery")));
    }

}
