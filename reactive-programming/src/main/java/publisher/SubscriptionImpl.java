package publisher;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubscriptionImpl implements Subscription {

    private static final Logger log = LoggerFactory.getLogger(SubscriptionImpl.class);
    private Subscriber<? super String> subscriber;
    private boolean isCancelled;
    public SubscriptionImpl(Subscriber<? super String> subscriber) {
        this.subscriber = subscriber;
    }
    @Override
    public void request(long l) {

    }

    @Override
    public void cancel() {
        log.info("Subscriber has cancelled");
        this.isCancelled = true;
    }
}
