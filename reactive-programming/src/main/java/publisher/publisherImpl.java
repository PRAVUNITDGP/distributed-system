package publisher;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class publisherImpl implements Publisher<String>{
    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        var subscription = new SubscriptionImpl(subscriber);
        subscriber.onSubscribe(subscription);
    }
}
