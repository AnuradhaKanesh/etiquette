public class Dresses implements Product{

   private String productName ="Dresses";
    int productPrice = 3000;
    int gstOnProduct = 0;

    @Override
    public int getGSTOnProduct() {
        return this.gstOnProduct;
    }

    @Override
    public int getProductPrice() {
        return this.productPrice;
    }

}
