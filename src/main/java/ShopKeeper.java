import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopKeeper {

    List<Product> productList;

    public ShopKeeper() {
        productList = new ArrayList<>();
    }


    public void addProducts(Product... productsList) {
        this.productList.addAll(Arrays.asList(productsList));
    }
}
