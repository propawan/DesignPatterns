package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay(){
//        Notify some paymentListener
        paymentListeners.forEach(PaymentListener::paymentMade);
    }

    public void registerPaymentListener(PaymentListener paymentListener){
        paymentListeners.add(paymentListener);
    }

    public void unregisterPaymentListener(PaymentListener paymentListener){
        paymentListeners.remove(paymentListener);
    }
}
