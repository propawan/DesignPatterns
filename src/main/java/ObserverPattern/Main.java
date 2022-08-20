package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();
        PaymentListener firstPaymentListener = new NotificationManager("abcd");
        paymentManager.registerPaymentListener(firstPaymentListener);
        PaymentListener secondPaymentListener = new PaymentEventLogger("fjak");
        paymentManager.registerPaymentListener(secondPaymentListener);
//        paymentManager.registerPaymentListener(()-> System.out.println("Dev Rocks"));
        paymentManager.pay();
        paymentManager.unregisterPaymentListener(secondPaymentListener);
        paymentManager.pay();
    }
}
