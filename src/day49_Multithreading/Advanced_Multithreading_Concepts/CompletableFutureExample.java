package day49_Multithreading.Advanced_Multithreading_Concepts;


/*
CompletableFuture (Java 8)
Concept:
Asynchronous computation pipeline.
Better than Future → supports chaining (thenApply, thenAccept, thenCombine).

Example:

 */


import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return "Hello";
                }).thenApply(str -> str + " World")
                .thenApply(str -> str + " from CompletableFuture!");

        System.out.println(future.get());
    }
}

/*
Hello World from CompletableFuture!



Dry Run:

supplyAsync runs task in background.
After completion → chained transformations applied.
Output: "Hello World from CompletableFuture!"

 */