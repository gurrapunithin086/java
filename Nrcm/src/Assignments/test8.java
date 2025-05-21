package Assignments;

interface Payment {
    void paymentMethods();
}

interface Shipping {
    void shippingOptions();
}

interface CustomerService extends Payment, Shipping {
    void supportChannels();
}

class Product {
    void productDetails() {
        System.out.println("Products: Laptops, Smartphones, Accessories");
    }
}

class OnlineStore extends Product implements CustomerService {
    public void paymentMethods() {
        System.out.println("Payment Methods: Credit Card, PayPal, UPI");
    }

    public void shippingOptions() {
        System.out.println("Shipping Options: Standard, Express, Same-Day Delivery");
    }

    public void supportChannels() {
        System.out.println("Support Channels: Chat, Email, Phone");
    }
}

public class test8 {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        Product product = new Product();

        product.productDetails();
        store.paymentMethods();
        store.shippingOptions();
        store.supportChannels();
    }
}
