package day68_Functional_Enhancements_Beyond_Streams;


/*
Functional + Reactive Introduction (Preview)
Reactive programming = asynchronous, non-blocking data streams.
Java provides this via:
Flow API (Java 9)
Reactive libraries like Reactor / RxJava
Basic example with Flow API (publisher/subscriber):
 */

import java.util.concurrent.Flow;

public class ReactiveDemo {
    public static void main(String[] args) {
        Flow.Publisher<String> publisher = subscriber -> {
            subscriber.onNext("Hello Reactive World!");
            subscriber.onComplete();
        };

        publisher.subscribe(new Flow.Subscriber<>() {
            public void onSubscribe(Flow.Subscription s) {}
            public void onNext(String item) {
                System.out.println(item);
            }
            public void onError(Throwable t) {}
            public void onComplete() {
                System.out.println("Done!");
            }
        });
    }
}

//Hello Reactive World!
//Done!