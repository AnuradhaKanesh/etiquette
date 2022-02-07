public class Jewellery implements Product{

    private String productName ="Jewellery";
    int productPrice = 2500;
    int gstOnProduct = 400;

    @Override
    public int getGSTOnProduct() {
        return this.gstOnProduct;
    }

    @Override
    public int getProductPrice() {
        return this.productPrice;
    }
}
