class Product {
    private String productName;
    private int productPrice;
    private int productQuantity;

    public Product(String productName,int productPrice,int productQuantity){
        this.productName=productName;
        this.productPrice=productPrice;
        this.productQuantity=productQuantity;
    }
    public String getProductName(){
        return productName;
    }
    public int getProductPrice(){
        return productPrice;
    }
    public int getProductQuantity(){
        return productQuantity;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Product prod=new Product("Iphone",1500000,4);
        System.out.println(prod.getProductName());
        System.out.println(prod.getProductPrice());
        System.out.println(prod.getProductQuantity());
    }
}