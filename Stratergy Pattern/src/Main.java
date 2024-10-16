public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStratergy(new CreditCardPayment("1234-5678-3456-6543"));
        shoppingCart.onPayment(500);

        shoppingCart.setPaymentStratergy(new Paypal("jjxdnjx@gmail.com"));
        shoppingCart.onPayment(1000);
    }
}