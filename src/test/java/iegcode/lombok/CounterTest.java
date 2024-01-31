package iegcode.lombok;

import org.junit.jupiter.api.Test;

public class CounterTest {

    private Counter counter = new Counter();

    @Test
    void testSynchronizer() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
          new Thread(() -> {
              for (int j = 0; j < 10; j++) {
                  counter.increment();
              }
          }).start();
        }

        Thread.sleep(2_000L);
        System.out.println(counter.getCounter());
    }
}
