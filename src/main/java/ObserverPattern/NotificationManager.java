package ObserverPattern;

import java.util.Objects;

public class NotificationManager implements PaymentListener{
    private String id;

    public NotificationManager(String id) {
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
        NotificationManager that = (NotificationManager) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private void sendNotification(){
        System.out.println("Notification Sent");
    }

    @Override
    public void paymentMade() {
        sendNotification();
    }
}
