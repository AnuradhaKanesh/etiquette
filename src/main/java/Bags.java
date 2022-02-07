public class Bags implements Product{
    private String productName ="Bags";
    int productPrice = 1200;
    int gstOnProduct = 100;

    @Override
    public int getGSTOnProduct() {
        return this.gstOnProduct;
    }

    @Override
    public int getProductPrice() {
        return this.productPrice;
    }
}
