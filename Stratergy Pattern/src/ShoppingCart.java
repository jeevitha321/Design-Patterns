public class ShoppingCart {
    private PaymentStratergy paymentStratergy;

    public void setPaymentStratergy(PaymentStratergy payment){
        this.paymentStratergy = payment;
    }

    public void onPayment(int amount){
        this.paymentStratergy.pay(amount);
    }
}
