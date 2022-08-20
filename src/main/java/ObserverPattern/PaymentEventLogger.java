package ObserverPattern;

import java.util.Objects;

public class PaymentEventLogger implements PaymentListener{
    private String id;

    public PaymentEventLogger(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEventLogger that = (PaymentEventLogger) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private void logEvent(){
        System.out.println("Payment Received");
    }

    @Override
    public void paymentMade() {
        logEvent();
    }
}
