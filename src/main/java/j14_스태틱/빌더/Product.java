package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Product{

    private int productCode;
    private String productName;
    private int price;
    private int stock;

    public static Productbuilder builder(){
        return new Productbuilder();
    }

    public static class Productbuilder{

        private int productCode;
        private String productName;
        private int price;
        private int stock;

        public Productbuilder productCode(int productCode){
            this.productCode = productCode;
            return this;
        }

        public Productbuilder productName(String productName){
            this.productName = productName;
            return this;
        }

        public Productbuilder price(int price) {
            this.price = price;
            return this;
        }

        public Productbuilder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Product build(){
            return new Product(productCode, productName, price, stock);
        }
    }

    public static Productbuilder productbuilder(){
        return new Productbuilder();
    }
}
