public class Paypal implements PaymentStratergy{

    private String email;

    public Paypal(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount){
        System.out.println("The email "+email+" paid the amount of "+amount);
    }
}
