import java.util.List;
import java.util.stream.Collectors;

public class PriceCalculator {

    public List<Product> extractProductGrtThan2000andGST(List<Product> productList)
    {
        return productList.stream().parallel().filter(product -> product.getProductPrice()>2000 && product.getGSTOnProduct()>0).collect(Collectors.toList());
    }
    public List<Product> extractProductWithGST(List<Product> productList)
    {
        return productList.stream().parallel().filter(product -> product.getGSTOnProduct()>0).collect(Collectors.toList());
    }
    public List<Product> extractProductWithoutGST(List<Product> productList)
    {
        return productList.stream().parallel().filter(product -> product.getGSTOnProduct()<=0).collect(Collectors.toList());
    }

}
