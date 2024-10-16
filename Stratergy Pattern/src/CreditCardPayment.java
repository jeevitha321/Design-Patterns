public class CreditCardPayment implements PaymentStratergy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount){
        System.out.println("The payment of " +amount+" is successful with card "+this.cardNumber);
    }
}
